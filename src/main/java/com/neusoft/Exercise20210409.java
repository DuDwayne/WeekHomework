package com.neusoft;

/**
 *  金融第一研发中心 每周一练（20210409）
 */
public class Exercise20210409 {

    /*
     * 已知一个员工信息表（表字段：emp_id ,birth_date ,name ,gender ,hire_date），
     * 请写一个SQL文，查出入职时间倒数第三的员工信息。
     */

    // ------------Oracle--------------------
    /*
       SELECT * FROM (SELECT * FROM emp ORDER BY hire_date DESC )
       WHERE rownum<=3
       MINUS
       SELECT * FROM (SELECT * FROM emp ORDER BY hire_date DESC )
       WHERE rownum<=2
     */

    /*
      SELECT *
          FROM (SELECT t.*, rownum
                FROM emp t
                ORDER BY hire_date DESC)
          WHERE rownum = 2
     */

    // ------------Oracle--------------------

    // ------------SQLServer-----------------
    /*
        SELECT t.*, row_number() over(ORDER BY hire_date DESC) rownum
            FROM emp t
            WHERE rownum = 3
     */
    // ------------SQLServer-----------------

    // ------------Postgre-----------------
    /*
        SELECT *
            FROM (SELECT *, row_number() over(ORDER BY hire_date DESC) AS rownum
                  FROM emp) t
            WHERE rownum =3
     */
    // ------------Postgre-----------------

}
