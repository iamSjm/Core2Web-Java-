void main(){
  int i = 40;
  while(i<=50){
    if(i % 2 == 0){
      print("Cube: " +(i*i*i).toString());
    }else{
      print("Square: " +(i*i).toString());
    }
   i++;
  }
}