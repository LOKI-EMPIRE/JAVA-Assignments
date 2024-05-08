(1) select product_name, year, price from sales s 
join product p where s.product_id = p.product_id

(2) select p.product_id, product_name from Product p 
join Sales s on p.product_id = s.seller_id
where sale_date between '2019-01-01' and '2019-03-31'
group by product_id;

(3) select c.customer_id, name from Customers c 
inner join Orders o on c.customer_id = o.order_id
inner join Product p on p.product_id= o.product_id
where price >= 100
