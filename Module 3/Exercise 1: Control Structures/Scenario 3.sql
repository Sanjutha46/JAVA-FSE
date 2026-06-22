DECLARE

    CURSOR loan_cursor IS
        SELECT loan_id,
               customer_id,
               due_date
        FROM loans
        WHERE due_date BETWEEN SYSDATE
                           AND SYSDATE + 30;

BEGIN

    FOR loan_rec IN loan_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID '
            || loan_rec.loan_id
            || ' for Customer '
            || loan_rec.customer_id
            || ' is due on '
            || TO_CHAR(loan_rec.due_date,'DD-MON-YYYY')
        );

    END LOOP;

END;
/
