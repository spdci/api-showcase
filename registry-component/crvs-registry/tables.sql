
CREATE TABLE IF NOT EXISTS public.farmerdemographic
(
    id integer NOT NULL DEFAULT nextval('farmerdemographic_id_seq'::regclass),
    farmer_id character varying COLLATE pg_catalog."default",
    uin character varying COLLATE pg_catalog."default",
    first_name character varying COLLATE pg_catalog."default",
    middle_name character varying COLLATE pg_catalog."default",
    gender character varying COLLATE pg_catalog."default",
    date_of_birth character varying COLLATE pg_catalog."default",
    mobile_number character varying COLLATE pg_catalog."default",
    contact_no2 character varying COLLATE pg_catalog."default",
    email_id character varying COLLATE pg_catalog."default",
    father_name character varying COLLATE pg_catalog."default",
    mother_name character varying COLLATE pg_catalog."default",
    mother_first_name character varying COLLATE pg_catalog."default",
    mother_last_name character varying COLLATE pg_catalog."default",
    husband_first_name character varying COLLATE pg_catalog."default",
    husband_last_name character varying COLLATE pg_catalog."default",
    last_name character varying COLLATE pg_catalog."default",
    CONSTRAINT farmerdemographic_pkey PRIMARY KEY (id)
)
CREATE TABLE IF NOT EXISTS public.account
(
    id integer NOT NULL DEFAULT nextval('account_id_seq'::regclass),
    farmer_id character varying COLLATE pg_catalog."default",
    account_no character varying COLLATE pg_catalog."default",
    bank_name character varying COLLATE pg_catalog."default",
    bank_code character varying COLLATE pg_catalog."default",
    branch_name character varying COLLATE pg_catalog."default",
    branch_code character varying COLLATE pg_catalog."default",
    account_holder_name character varying COLLATE pg_catalog."default",
    account_type character varying COLLATE pg_catalog."default",
    CONSTRAINT account_pkey PRIMARY KEY (id)
)
CREATE TABLE IF NOT EXISTS public.address
(
    id integer NOT NULL DEFAULT nextval('address_id_seq'::regclass),
    farmer_id character varying COLLATE pg_catalog."default",
    house_no character varying COLLATE pg_catalog."default",
    address_line_1 character varying COLLATE pg_catalog."default",
    address_line_2 character varying COLLATE pg_catalog."default",
    village_town character varying COLLATE pg_catalog."default",
    taluka character varying COLLATE pg_catalog."default",
    district character varying COLLATE pg_catalog."default",
    state character varying COLLATE pg_catalog."default",
    pincode character varying COLLATE pg_catalog."default",
    CONSTRAINT address_pkey PRIMARY KEY (id)
)
CREATE TABLE IF NOT EXISTS public.crop_details
(
    id integer NOT NULL DEFAULT nextval('crop_details_id_seq'::regclass),
    land_id character varying COLLATE pg_catalog."default",
    season_name character varying COLLATE pg_catalog."default",
    crop_info character varying COLLATE pg_catalog."default",
    CONSTRAINT crop_details_pkey PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS public.land_farmer_mapping
(
    id integer NOT NULL DEFAULT nextval('land_farmer_mapping_id_seq'::regclass),
    farmer_id character varying COLLATE pg_catalog."default",
    land_id character varying COLLATE pg_catalog."default",
    tenant_type character varying COLLATE pg_catalog."default",
    CONSTRAINT land_farmer_mapping_pkey PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS public.land_info
(
    id integer NOT NULL DEFAULT nextval('land_info_id_seq'::regclass),
    survay_no character varying COLLATE pg_catalog."default",
    khata_no character varying COLLATE pg_catalog."default",
    plot_owner_name character varying COLLATE pg_catalog."default",
    village_town character varying COLLATE pg_catalog."default",
    district character varying COLLATE pg_catalog."default",
    state character varying COLLATE pg_catalog."default",
    CONSTRAINT land_info_pkey PRIMARY KEY (id)
)

 
