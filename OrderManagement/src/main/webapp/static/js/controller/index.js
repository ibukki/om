var viewData = {
	carModel:"Infinite",
	licenseNumber:"沪BPF980",
	mileage:"5000",
	owner:"Ryan Huang",
	maintainType:"Maintenance",
	phone:"13761202697",
	totalAmount:"1",
	inshopDate:"2017/01/01",
	comment:"fix it",
	disableSubmitButton:false
}

var vm = new Vue({
	el:"#content",
	data:viewData,
	methods:{
		submitOrder: function(){
			console.log(this.licenseNumber);
		}
	}
});

$("#inshopDatePicker").datetimepicker({
    locale: 'zh-CN',
    weekStart: 1,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 2,
	minView: 2,
	forceParse: 0,
	format:'yyyy/MM/dd'
});