// ==UserScript==
// @name         抖音时间管理
// @description  自用抖音时间管理+其他优化
// @namespace    http://tampermonkey.net/
// @version      2023.2.10
// @author       仰晨
// @match        *://*.douyin.com/*
// @icon         https://lf1-cdn-tos.bytegoofy.com/goofy/ies/douyin_web/public/favicon.ico
// @grant        none
// @license      AGPL License
// ==/UserScript==


//加载完成时自行↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
window.onload=function (){
    try{

        //把左边直接删了
        document.getElementsByClassName("N_HNXA04")[0].parentNode.removeChild(document.getElementsByClassName("N_HNXA04")[0]);

        setTimeout(function (){

            //为了兼容个人主页就只会这样删了2023.2.7
            let e =document.getElementsByClassName("JTui1eE0");
            for (let i = e.length-1; i >0; i--) {
                let delText = e[i].querySelector("p").innerHTML;
                if (delText==="收藏网页"||delText==="合作") {
                    e[i].remove();
                }
            }

            //自动打开评论区
            document.getElementsByClassName("tzVl3l7w")[0].click();
        },1500)

        //抖音最近默认进来是静音的，直接解除静音（muted）
        document.getElementsByTagName("video")[0].muted = false;


    }catch(err){
        console.log("呃呃，哈哈了,你小子不在主页进来的吧");}
}
//加载完成时自行-↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑



var 延迟时间=5*60*1000;
//开始计时===============================================================================================
setTimeout(function (){
    //赋初始值
    var i = 1;
    var sj="00:00"
    var videoTime=document.getElementsByClassName('time-current');
    var index=0;//如果只刷一个视频就只有一个索引，开始第二个的时候就会出现三个索引【0，1，2】当前一般是【1】


    var div = document.createElement("div");
    div.innerText="5分钟到了-----------------------------------------------------";
    div.setAttribute('id','kun'); //设置标签属性
    var fu = document.getElementById("slidelist");//找到想成为的父标签
    var one=fu.firstChild;// 获取父标签的第一个子元素
    fu.insertBefore(div,one); // 在父标签的第一个子元素，前插入div标签

    //改一下样式
    do{
        let style=`
	ul.JTui1eE0{
        transition: all 20s ;
		width: 100px;
		background-color: #5f6175a8;
		border-radius: 8px;
		margin: 0px 10px;
		box-shadow: 0 0px 9px 1px #fff;							 /*阴影     水平偏移 垂直偏移  模糊  阴影大小*/
	}
    #kun{
        width:100%;
        height: 100%;
        animation:ikun 5s infinite;
    }
    @keyframes ikun {
    	0% {background-color: red;}
    	50% {background-color: #06f;}
		100% {background-color: red;}
	}
    `;
        let ele=document.createElement("style");
        ele.innerHTML=style;
        document.getElementsByTagName('head')[0].appendChild(ele);
    }while(false);


    //判断退出代码↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    for (let i=0; i<3600; i++)task(i);


    function task(i) {setTimeout( function () {
        try{
            if (videoTime.length===3){
                index=1;//获取视频个数   要么是1个要么是3个 三个的时候 当前看的是第二个

                //反正到时间了，下面的视频就直接隐藏掉
                document.getElementsByClassName("xg-video-container")[2].style.display='none';
            }

            //判断这一秒的时间是否大过上一秒的时间  大过说明看完了 该润了
            if(sj>videoTime[index].innerText){
                alert("够钟死心了");window.opener = null; window.open('', '_self'); window.close();
                //这种情况是偶尔才会出现，没有自动关闭，就让视频和声音隐藏
                setTimeout(function (){
                    document.getElementsByTagName("video")[0].muted = true;
                },1000)
            }
            //刷新时间值
            sj=videoTime[index].innerText;
            document.getElementsByClassName("time")[index].innerHTML = "---------5分钟到了+"+i+"秒"+sj+">？"+videoTime[index].innerText;i++;
        }catch(err){
            console.log("离谱");
        }
    }, 1000 * i);}

},延迟时间);//在5分钟后执行代码--------------------------------------------------------------------------------------------------------



do{//样式----------------------------------------------------------------------------------------------
    let style=`
    /*消失吧哈哈哈*/
	/*收藏 和 合作  div.MFb3tP0s div.JTui1eE0:nth-last-child(n+4) 在个人主页会把回到看视频都给干没了*/
	.DsdpRAYf,			/*主页的下载电脑客户端*/
	.QUUswvJ3{			/*客户端推荐*/
		display: none;
	}
    `;
    //cursor:pointer;变小手   :hover碰到触发    transition: all .5s;过渡动画0.5秒   display: flex;弹性盒子

    let ele=document.createElement("style");
    ele.innerHTML=style;
    document.getElementsByTagName('head')[0].appendChild(ele);
}while(false);






////创建一个p元素
//var para = document.createElement("span");
//para.innerText="我是新标签";
//获取div
//var div=document.getElementsByClassName("xgplayer-time")[0];
//添加标签
//iv.appendChild(para);


//获取标签属性的值
//document.getElementsByClassName("xgplayer-volume")[0].getAttributeNode("data-state").value="normal";//small


//setTimeout(function(){alert("Hello");window.opener = null; window.open('', '_self'); window.close();},5*60*1000);//在一定时间后执行代码

//setTimeout(() => {
//        console.log(document.getElementsByClassName('time-current')[0].innerText);
//    }, 1000);//每隔一段时间后执行代码
//setInterval(function shijian(){for(let i=5;i>0;i--){console.log(document.getElementsByClassName('time-current')[0].innerText);}},1000)//每隔一段时间后执行代码
