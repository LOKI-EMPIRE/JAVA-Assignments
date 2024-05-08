(1) select name, coalesce(sum(distance),0) as travelled_distance from Users u 
left join Rides r on u.id = r.user_id
group by name
order by travelled_distance desc, name;

(2) select * from employee
where salary>3000 and months<10

(3) select show_name, from_year, to_year from shows s 
join genres g on s.genre_id = g.id 
where s.from_year = 2010 and g.genre_name like "action";
