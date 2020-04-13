var scn_data={
		alarm:{alarm:10,fault:10},
		almMsg:[{msg:"2020年4月8日市A区12#机器体积过高报警"},
				{msg:"南京市A区12#机器温度过高报警"},
				{msg:"江苏省12#机器湿度过重报警"},
				{msg:"南京江宁B区12#机器重量过高报警"}
				],
		msgCnt:[{msg:100,alm:20},
			{msg:200,alm:40},
			{msg:300,alm:50},
			{msg:400,alm:35},
			{msg:400,alm:40},
			{msg:400,alm:11},
			{msg:400,alm:66},
			{msg:100,alm:77},
			{msg:200,alm:88},
			{msg:300,alm:22},
			{msg:400,alm:99},
			{msg:400,alm:100},
			{msg:400,alm:111},
			{msg:400,alm:222},
			{msg:100,alm:333},
			{msg:200,alm:11},
			{msg:300,alm:33},
			{msg:400,alm:55},
			{msg:400,alm:77},
			{msg:400,alm:90}
			],
		map:[
			{area:"浙江",cnt:40},
			{area:"江苏",cnt:50}
		],
		factoryHeader:[
	        {"categories":"设备名称"},
	        {"categories":"设备功能"},
	        {"categories":"报警"},
	        {"categories":"操作"}
    	],
		factory:[
			{"company":"设备1","dtuCnt": "加热", "alarm": "无"},
	        {"company":"设备2","dtuCnt": "雾化器","alarm": "无"},
	        {"company":"设备3","dtuCnt": "散热","alarm": "温度上限报警>120"},
	        {"company":"设备4","dtuCnt": "雾化器","alarm": "无"}
		]
	};
var vm = new Vue({
	el: '#content',
	data: scn_data,
	methods: {
		details: function() {

		}
	}
})
