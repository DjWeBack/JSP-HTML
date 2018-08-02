<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���۸� �߰��ϱ�</title>
<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCPylRXerp6Mzm3dh7vP16silCpPTXccnA"></script>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	var map;
	var myPosition = {
		latitude:37.478710, 
	    longitude:126.878700
	};
	function getMyLocation(){
	//�������� ���������̼� API�� �����ϴ��� ���θ� �˻��ϴ� �κ�
	//navigator.geolocation��ü�� �����ϸ� �����ϴ� ���̴�.
		if(navigator.geolocation){
	//�����ϰ� �ִٸ� getCurrentPosition�޼ҵ带 ȣ���ؼ� displayLocation�̶� �ڵ鷯 �Լ��� ȣ����
	//navigator.geolocation�Ӽ��� ���������̼� API��ü�� �����ϴ� ��ü��.
	//�� API�� ���� �޼ҵ尡 �������� ��ġ�� �������� ���� �ϴ� getCurrentPosition��.
			navigator.geolocation.getCurrentPosition(displayLocation);
		}
		else{
			console.log("�̷� ���������̼��� �������� �ʾƿ�.....");
		}
	}
	function displayLocation(position){
		console.log('displayLocationȣ�� ����');
		var latitude = position.coords.latitude;
		var longitude = position.coords.longitude;
		$("#location").text("����� ���� : "+latitude+", ����� �浵 : "+longitude);
		showMap(position.coords);
	}
	function showMap(coords){
		var latNlong = new google.maps.LatLng(coords.latitude, coords.longitude);
		//alert("latNlong : "+latNlong);
		var mapOptions={
			zoom:16,
			center:latNlong,
			streetViewControl:true,//�ε��
			mapTypeControl:false,//���� Ÿ��
			fullscreenControl:false,
			//SATELITE�� HYBRID
			mapTypeId:google.maps.MapTypeId.ROADMAP
		};
		//�ڹٽ�ũ��Ʈ������ DOM�� ������ �� �ִ�.
		//�� DOM�� ������ �� �迭ǥ������ ����� �� ����.
		//���� �̸��� �������� �Ǹ� �ڵ����� �迭�� ��ȯ��.
		// new javax.swing.JFrame  new java.util.HashMap
		map = new google.maps.Map($("#location")[0],mapOptions);
		//��ǳ�� �߰��ϱ�
		var makerTitle = "���ǰ� ��õ�ϴ� ����";
		var parklatNlong = new google.maps.LatLng(37.480430, 126.879001);
		var maker = new google.maps.Marker({
			position:parklatNlong
		   ,map:map
		   ,title:makerTitle
		});
		var makerMaxWidth = 300;//��Ŀ�� Ŭ������ �� ��Ÿ���� ��ǳ���� �ִ� ũ��
		//��ǳ���� ����
		var mcontent = "<div>";
		mcontent+="<h2>"+makerTitle+"</h2><p>���ִ� �޴��� �����̿� ������� �����̴� �ж��� �Ἥ �ξ� �̱��ϰ� ���� �̸��� �ұ����� �Ծ���ؿ� �׸��� 3���̻��̸� �ݶ� ����..</p>";
		mcontent+="</div>";
		var infoWin = new google.maps.InfoWindow({
			content:mcontent,
			maxWidth:makerMaxWidth
		});
		//�̺�Ʈ ó��
		google.maps.event.addListener(maker,'click',function(){
			infoWin.open(map,maker);
		});
		//���� ������ ��ǳ�� �ݱ�
		google.maps.event.addListener(map,'click',function(){
			infoWin.close();
		});
		console.log("map:"+map);
	}
</script>
</head>
<body onLoad="getMyLocation()">
<div id="location" style="width:900px;height:700px;">
<!-- �������� ��ġ�� ���⿡ ��Ÿ�� ����... -->
</div>
</body>
</html>


