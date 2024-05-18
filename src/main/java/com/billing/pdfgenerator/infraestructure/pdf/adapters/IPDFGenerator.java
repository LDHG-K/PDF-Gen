package com.billing.pdfgenerator.infraestructure.pdf.adapters;

import com.billing.pdfgenerator.domain.dto.PDFInformation;

import java.util.Base64;

public interface IPDFGenerator {

    Base64 generatePDF (PDFInformation pdfInformation);
}