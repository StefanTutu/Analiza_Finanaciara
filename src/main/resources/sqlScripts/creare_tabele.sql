CREATE TABLE cont_client(
id bigint NOT NULL,
denumire varchar(255) NOT NULL,
suma float NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE indicator_financiar(
id bigint NOT NULL,
denumire varchar(255) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE active_circulante(
cont_id bigint,
activ_circulant_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_activ_circulant_id FOREIGN KEY (activ_circulant_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE datorii_curente(
cont_id bigint,
datorii_curente_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_datorii_curente_id FOREIGN KEY (datorii_curente_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE stocuri(
cont_id bigint,
stocuri_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_stocuri_id FOREIGN KEY (stocuri_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE investitii_termen_scurt(
cont_id bigint,
investitii_termen_scurt_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_investitii_termen_scurt_id FOREIGN KEY (investitii_termen_scurt_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE creante(
cont_id bigint,
creante_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_creante_id FOREIGN KEY (creante_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE disponibilitati_banesti_casierie(
cont_id bigint,
disponibilitati_banesti_casierie_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_disponibilitati_banesti_casierie_id FOREIGN KEY (disponibilitati_banesti_casierie_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE conturi_bancare(
cont_id bigint,
conturi_bancare_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_conturi_bancare_id FOREIGN KEY (conturi_bancare_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE credite_bancare_termen_scurt(
cont_id bigint,
credite_bancare_termen_scurt_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_credite_bancare_termen_scurt_id FOREIGN KEY (credite_bancare_termen_scurt_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE total_datorii(
cont_id bigint,
total_datorii_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_total_datorii_id FOREIGN KEY (total_datorii_id) REFERENCES indicator_financiar(id)
);


CREATE TABLE total_activ(
cont_id bigint,
total_activ_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_total_activ_id FOREIGN KEY (total_activ_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE capital_propriu(
cont_id bigint,
capital_propriu_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_capital_propriu_id FOREIGN KEY (capital_propriu_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE total_capitaluri(
cont_id bigint,
total_capitaluri_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_total_capitaluri_id FOREIGN KEY (total_capitaluri_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE scadente_rambursare(
cont_id bigint,
scadente_rambursare_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_scadente_rambursare_id FOREIGN KEY (scadente_rambursare_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE dobanzi_rate(
cont_id bigint,
dobanzi_rate_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_dobanzi_rate_id FOREIGN KEY (dobanzi_rate_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE cashFlow(
cont_id bigint,
cashFlow_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_cashFlow_id FOREIGN KEY (cashFlow_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE capital_permanent(
cont_id bigint,
capital_permanent_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_capital_permanent_id FOREIGN KEY (capital_permanent_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE pasiv_total(
cont_id bigint,
pasiv_total_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_pasiv_total_id FOREIGN KEY (pasiv_total_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE datorii_termen_lung(
cont_id bigint,
datorii_termen_lung_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_datorii_termen_lung_id FOREIGN KEY (datorii_termen_lung_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE cifra_de_afaceri(
cont_id bigint,
cifra_de_afaceri_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_cifra_de_afaceri_id FOREIGN KEY (cifra_de_afaceri_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE capitaluri_circulante(
cont_id bigint,
capitaluri_circulante_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_capitaluri_circulante_id FOREIGN KEY (capitaluri_circulante_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE stoc_global_mediu(
cont_id bigint,
stoc_global_mediu_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_stoc_global_mediu_id FOREIGN KEY (stoc_global_mediu_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE baza_calcul(
cont_id bigint,
baza_calcul_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_baza_calcul_id FOREIGN KEY (baza_calcul_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE numar_rotatii(
cont_id bigint,
numar_rotatii_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_numar_rotatii_id FOREIGN KEY (numar_rotatii_id) REFERENCES indicator_financiar(id)
);

CREATE TABLE stocuri_medii(
cont_id bigint,
stocuri_medii_id bigint,
CONSTRAINT fk_cont_id FOREIGN KEY (cont_id) REFERENCES cont_client(id),
CONSTRAINT fk_stocuri_medii_id FOREIGN KEY (stocuri_medii_id) REFERENCES indicator_financiar(id)
);

CREATE SEQUENCE cont_client_id_seq START WITH 1 INCREMENT BY 1 NO CYCLE;
CREATE SEQUENCE indicator_financiar_id_seq START WITH 1 INCREMENT BY 1 NO CYCLE;
