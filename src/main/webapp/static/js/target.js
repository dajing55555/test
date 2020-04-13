$(function(){
    var myChart = echarts.init(document.getElementById('container2'));
    var temperatureData = [];
    var humidityData = [];
    var volumeData =[];
    var weightData =[];
    var windData =[];
    var dateArr = [];

    // $.ajax({
    //     url : "environment/list" ,
    //     type : 'GET',
    //     success : function(result) {
    //         var obj = $.parseJSON(result);
    //         if(obj.code = '200'){
    //             for (var i = 0; i < obj.data.length; i++) {
    //                 var data = obj.data;
    //                 temperatureData.push(data[i].temperature);
    //                 humidityData.push(data[i].humidity);
    //                 volumeData.push(data[i].volume);
    //                 weightData.push(data[i].weight);
    //                 windData.push(data[i].wind);
    //                 dateArr.push(data[i].monitorTime)
    //             }
    //         }
    //     }
    // });

    //数据
    for (var i = 0; i < 20; i++) {
        var a = Math.random() * 10;
        var b = Math.random() * 10;
        var c = Math.random() * 10;
        var d = Math.random() * 10;
        var e= Math.random() * 10;
        temperatureData.push(a);
        humidityData.push(b);
        volumeData.push(c);
        weightData.push(d);
        windData.push(e);
    }

// option
    option = {
        backgroundColor: '#0e1E3F',
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        legend: {
            data: ['温度', '湿度', '体积','重量','风速'],
            textStyle: {
                color: '#ccc'
            }
        },
        xAxis: {
            data: ['00:00','01:00',"02:00","03:00","04:00","05:00","06:00","07:00","08:00",'09:00','10:00','11:00','12:00','13:00','14:00','15:00','16:00','17:00','18:00','19:00','20:00','21:00','22:00','23:00'],
            // data:dateArr,
            axisLine: {
                lineStyle: {
                    color: '#ccc'
                }
            }
        },
        yAxis: {
            splitLine: {show: false},
            axisLine: {
                lineStyle: {
                    color: '#ccc'
                }
            }
        },
        series: [{
            name: '温度',
            type: 'line',
            smooth: true,
            showAllSymbol: true,
            symbol: 'emptyCircle',
            symbolSize: 5,
            markPoint: {
                data: [
                    {type: 'max', name: '最大值'},
                    {type: 'min', name: '最小值'}
                ]
            },
            markLine: {
                data: [
                    {type: 'average', name: '平均值'}
                ]
            },
            data: temperatureData
        },
            {
                name:'湿度',
                type:'line',
                smooth: true,
                showAllSymbol: true,
                symbol: 'emptyCircle',
                symbolSize: 5,
                itemStyle: {
                    normal: {
                        color:"#45c0ff"
                    }
                },
                data:humidityData,
            },
            {
                name: '体积',
                type: 'bar',
                barWidth: 8,
                itemStyle: {
                    barBorderRadius: 5,
                    color: new echarts.graphic.LinearGradient(
                        0, 0, 0, 1,
                        [
                            {offset: 1, color: '#43eec6'}
                        ]
                    )
                },
                data: volumeData
            }, {
                name: '重量',
                type: 'bar',
                itemStyle: {
                    color: '#ffcb89'
                },
                barWidth: 8,
                data: weightData
            }, {
                name: '风速',
                type: 'line',
                itemStyle: {
                    color: '#1afffd'
                },
                smooth: true,
                showAllSymbol: true,
                symbol: 'emptyCircle',
                symbolSize: 5,
                data: windData
            }]
    };
    myChart.setOption(option);
});
