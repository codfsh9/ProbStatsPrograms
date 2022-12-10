clear all, fclose all
fid = fopen('octavetest.csv','r');
A = fscanf(fid,'%f, %f',[2,11])
B = A'
fclose(fid);

x = B(:,1);
y = B(:,2);

plot(x,y);
title('Plot of y=x^2')
xlabel('x');
ylabel('y');
grid on
set(gca, 'linewidth', 2, 'fontsize', 20)
