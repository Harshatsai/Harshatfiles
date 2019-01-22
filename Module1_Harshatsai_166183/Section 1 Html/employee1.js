function calculate(){
			var t=document.getElementById("select").value;
			var fn=document.getElementById("fname").value;
			var ln=document.getElementById("lname").value;
			var gs=document.getElementById("gs").value
			var tax;
			var net_sal=gs-((gs*10)/100);
			document.write(t+fn+ln+gs+"&nbsp your net salary is: "+net);
			if(fn.length()>15||ln.length()>15){
				alert("name should be less than 15 char");
			}
			if(gs<18000){
				tax=0;
			}
			else if(gs>=18000 && gs<30000){
				tax=10;
			}
			else if(gs>=30000 && gs<50000){
				tax=20;
			}
			else if(gs>=50000){
				tax=30;
			}
			var net=gs-((gs*10)/100);
			document.write(t+"  "+fn+"  "+ln+" &nbsp your net salary is: "+net);
		}