--Kik(kutya) futottak hibátlant?

select k.hivonev,kk.teljesnev from futamok join kutyasok kk on kutyasok_id = kk.id join kutyak k on kutya_id =k.id where hiba =0;

--Hány fajta kutya versenyzett? 
select count(kk.id) from  kutyak k
join kutyafajtak kf on fajta_id=kk.id
join futamok f on kutya_id=k.id;
--vagy
select count(kutyafajta) from kutyafajtak k join kutyak on fajta_id =k.id join futamok f on kutya_id =kutyak.id;
select k2.kutyafajta,count(k.id) from kutyak k join kutyafajtak k2 on fajta_id=k2.id join futamok f on kutya_id =k.id group by k2.id;
--Erre nem jöttem rá mit rontottam el

--Kinek volt a legtöbb hibája?

select k.hivonev,kk.teljesnev from futamok join kutyak k on kutya_id=k.id join kutyasok kk on kutyasok_id=kk.id 
where futamok.hiba= (select max(hiba) from futamok);

--Hány 5 évesnél fiatalabb kutya van?
 select count(kor) from kutyak where kor<5;

--Első helyezett kutyák milyen fajtájúak egyes futamokon?

select kk.kutyafajta,f.id from  kutyak
join kutyafajtak kk on fajta_id=kk.id
join futamok f on kutya_id=kutyak.id 
where f.eredmeny=1;


--Méretkategóriánként hány kutya indult versenyen? Ugrómagasság szerinti sorrendbe rendezve!

select m.meret,count(k.id) from kutyak k join meretkategoria m on meretkat_id=m.id join futamok f on kutya_id =k.id
group by meret,m.id order by m.id asc;

--Milyen szinteken versenyeztek a kutyák? Kutya neve+szintje kezdőtől haladóig!

select k.hivonev,szint.szint from kutyak k join szintkategoria szint on szintkat_id=szint.id join futamok f on kutya_id =k.id
order by szint.id asc;