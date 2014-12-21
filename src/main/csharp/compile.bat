SET CSCPATH=%SYSTEMROOT%\Microsoft.NET\Framework\v4.0.30319
%CSCPATH%\csc /reference:bin/Newtonsoft.Json.dll /target:library /out:bin/Org.Quantintel.Spectrum.dll /recurse:src\*.cs /doc:bin/Org.Quantintel.Spectrum.xml
