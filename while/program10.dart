void main() {
  int n = 6;
  int factorial = 1;
  int i = 1;

  while (i <= n) {
    factorial *= i;
    i++;
  }

  print( factorial);
}
