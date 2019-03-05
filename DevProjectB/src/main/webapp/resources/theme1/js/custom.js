$(document).ready(function() {
	    $('#datepicker').datepicker();
	});

var series = [
	{name: 'Company A', product: 'A1'},
	{name: 'Company A', product: 'A2'},
	{name: 'Company A', product: 'A3'},
	{name: 'Company B', product: 'B1'},
	{name: 'Company B', product: 'B2'}
	]

	$(".company").change(function(){
		var company = $(this).val();
		var options =  '<option value=""><strong>Products</strong></option>';
		$(series).each(function(index, value){
			if(value.name == company){
				options = '<option value="'+value.product+'">'+value.product+'</option>';
			}
		});
		
		$('.product').html(options);
	});
