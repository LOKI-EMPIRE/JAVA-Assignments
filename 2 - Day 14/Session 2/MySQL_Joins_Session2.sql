(1) select product_name, year, price from Sales s 
join Product p on s.product_id = p.product_id
order by year asc, product_name, price  

(2) select unique_id, name from EmployeeUNI u 
right join Employees e on u.id = e.id
order by u.unique_id is null

(3) select c.customer_id, name from Customers c 
inner join Orders o on c.customer_id = o.order_id
inner join Product p on p.product_id = o.product_id
where price>=100
