(1) select city, length(city) as length from station
    order by length desc limit 1;

(2) select name from employee order by name desc;

(3) select distinct sell_date as date , count(product) as no_of_products from orders
    group by sell_date; 

(4) select s.buyer_id from sales s join product p on p.product_id = s.product_id
    where p.product_name='S8'
    and s.buyer_id not in(
         select s2.buyer_id from sales s2 join product p2 on p2.product_id = s2.product_id
         where p2.product_name='iPhone'
    );
