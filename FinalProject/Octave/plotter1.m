## Author: Cody Kimmins
## Created: 2022-11-27

## Function to generate x and y values and plot them for original linear graph
## and then calls the saltData function.

function plotter()
  x = []
  y = []

  for i = 1:100
    newElem = i + 1
    x = [x newElem]
  endfor

  disp(x)

  for i = 1:length(x)
    newElem = (2*(i) + 5)
    y = [y newElem]
  endfor

  subplot(2,2,1)
  plot(x,y,"r");
  title("Original Linear Graph")
  hold on
  disp(x)
  disp(y)
  xlabel('x');
  ylabel('y');
  grid on
  set(gca, 'linewidth', 2, 'fontsize', 16)
  saltData(x,y)
endfunction

## Salting function that generates random integers from 1 to 15 and adds or
## subtracts every y value. The smoothData function is called at the end.

function saltData(x,y)

  counter = 1

for i = 1:length(x)
   ri = randi(15,1)
   rj = randi(50,1)
   if(mod(counter,2) == 1)
      y(i) += (ri - rj)
   else
      y(i) -= (ri + rj)
   endif
  counter++
endfor
  disp(y)
  subplot(2,2,2)
  plot(x,y,"b");
  title("Salted Linear Graph")
  xlabel('x');
  ylabel('y');
  grid on
  set(gca, 'linewidth', 2, 'fontsize', 16)
  smoothData(x,y)
endfunction

## Smoothing function that computes the rolling average of 3 numbers then adds
## it to the yVal list and plots the data.

function smoothData(x,y)

  s = []
  for i = 1:length(x) - 2
    newVal = (y(i) + y(i + 1) + y(i + 2))/3
    s = [s newVal]
  endfor

  x(end) = [];
  x(end) = [];
  disp(s)
  subplot(2,2,3)
  plot(x,s,"m")
  title("Smoothed Linear Graph")
  xlabel('x');
  ylabel('y');
  grid on
  set(gca, 'linewidth', 2, 'fontsize', 16)
endfunction
