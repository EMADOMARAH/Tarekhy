package com.example.tarekhy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText Year,Month,Day;
    TextView result;
    Button button;
    String finalresult;
    int month,day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Year = findViewById(R.id.Year);
        Month = findViewById(R.id.Month);
        Day = findViewById(R.id.Day);
        result = findViewById(R.id.result);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i , j , row=0;

                int MONTH[][]={{4,0,0,3,5,1,3,6,2,4,0,2},{5,1,1,4,6,2,4,0,3,5,1,3},{6,2,2,5,0,3,5,1,4,6,3,4},{0,3,4,0,2,5,0,3,6,1,4,6},{2,5,5,1,3,6,1,4,0,2,5,0},{3,6,6,2,4,0,2,5,1,3,6,1},{4,0,0,3,5,1,3,6,2,4,0,2},
                        {5,1,2,5,0,3,5,1,4,6,2,4},{0,3,3,6,1,4,6,2,5,0,3,5},{1,4,4,0,2,5,0,3,6,1,4,6},{2,5,5,1,3,6,1,4,0,2,5,0},{3,6,0,3,5,1,3,6,2,4,0,2},{5,1,1,4,6,2,4,0,3,5,1,3},{6,2,2,5,0,3,5,1,4,6,2,4},
                        {0,3,3,6,1,4,6,2,5,0,3,5},{1,4,5,1,3,6,1,4,0,2,5,0},{3,6,6,2,4,0,2,5,1,3,6,1},{4,0,0,3,5,1,3,6,2,4,0,2},{5,1,1,4,6,2,4,0,3,5,1,3},{6,2,3,6,1,4,6,2,5,0,3,5},{1,4,4,0,2,5,0,3,6,1,4,6},
                        {2,5,5,1,3,6,1,4,0,2,5,0},{3,6,6,2,4,0,2,5,1,3,6,1},{4,0,1,4,6,2,4,0,3,5,1,3},{6,2,2,5,0,3,5,1,4,6,2,4},{0,3,3,6,1,4,6,2,5,0,3,5},{1,4,4,0,2,5,0,3,6,1,4,6},{2,5,6,2,4,0,2,5,1,3,6,1}};

                int DAY[][]={{1,8,15,22,29,36},{2,9,16,23,30,37},{3,10,17,24,31,0},{4,11,18,25,32,0},{5,12,19,26,33,0},{6,13,20,27,34,0},{7,14,21,28,35,0}};



                int year = Integer.parseInt(Year.getText().toString());



                if (year >=1801 &&year<=1900)
                {
                    int YEAR[][]={{1801,1829,1857,1885},{1802,1830,1858,1886},{1803,1831,1859,1887},{1804,1832,1860,1888},{1805,1833,1861,1889},{1806,1834,1862,1890},{1807,1835,1863,1891},{1808,1836,1864,1892},{1809,1837,1865,1893},{1810,1838,1866,1894},{1811,1839,1867,1895},{1812,1840,1868,1896},{1813,1841,1869,1897},{1814,1842
                            ,1870,1898},{1815,1843,1871,1899},{1816,1844,1872,1900},{1817,1845,1873,0},{1818,1846,1874,0},{1819,1847,1875,0},{1820,1848,1876,0},{1821,1849,1877,0},{1822,1850,1878,0},{1823,1851,1879,0},{1824,1852,1880,0},{1825,1853,1881,0},{1826,1854,1882,0},{1827,1855,1883,0},{1828,1856,1884,0}};
                    for( i=0;i<28;i++)
                    {
                        for( j=0;j<4;j++)
                        {
                            if ( year == YEAR[i][j])
                            {
                                row = i;
                            }
                        }
                    }
                    Toast.makeText(getApplicationContext(),"not 80",Toast.LENGTH_SHORT).show();
                }else if (year >=1901 && year<=2000)
                {
                    int YEAR[][]={{0,1925,1953,1981},{0,1926,1954,1982},{0,1927,1955,1983},{0,1928,1956,1984},{1901,1929,1957,1985},{1902,1930,1958,1986},{1903,1931,1959,1987},{1904,1932,1960,1988},{1905,1933,1961,1989},{1906,1934,1962,1990},{1907,1935,1963,1991},{1908,1936,1964,1992},{1909,1937,1965,1993},{1910,1938,1966,1994},{1911,1939,1967
                            ,1995},{1912,1940,1968,1996},{1913,1941,1969,1997},{1914,1942,1970,1998},{1915,1943,1971,1999},{1916,1944,1972,2000},{1917,1945,1973,0},{1918,1946,1974,0},{1919,1947,1975,0},{1920,1948,1976,0},{1921,1949,1977,0},{1922,1950,1978,0},{1923,1951,1979,0},{1924,1952,1980,0}};

                    for( i=0;i<28;i++)
                    {
                        for( j=0;j<4;j++)
                        {
                            if ( year == YEAR[i][j])
                            {
                                row = i;
                            }
                        }
                    }
                }else if (year >=2001 && year<=2092)
                {
                    int YEAR[][]={{0,2009,2037,2065},{0,2010,2038,2066},{0,2011,2039,2067},{0,2012,2040,2068},{0,2013,2041,2069},{0,2014,2042,2070},{0,2015,2043,2071},{0,2016,2044,2072},{0,2017,2045,2073},{0,2018,2046,2074},{0,2019,2047,2075},{0,2020,2048,2076},{0,2021,2049,2077},{0,2022,2050,2078},{0,2023,2051,2079}
                            ,{0,2024,2052,2080},{0,2025,2053,2081},{0,2026,2054,2082},{0,2027,2055,2083},{0,2028,2056,2084},{2001,2029,2057,2085},{2002,2030,2058,2086},{2003,2031,2059,2087},{2004,2032,2060,2088},{2005,2033,2061,2089},{2006,2034,2062,2090},{2007,2035,2063,2091},{2008,2036,2064,2092}};

                    for(i=0;i<28;i++)
                    {
                        for(j=0;j<4;j++)
                        {
                            if ( year == YEAR[i][j])
                            {
                                row = i;
                            }
                        }
                    }
                }else {

                    Toast.makeText(getApplicationContext(),"دخل السنه صح يابيه",Toast.LENGTH_SHORT).show();
                }


                day = Integer.parseInt(Day.getText().toString());
                if (day<=0||day>31)
                {
                    Toast.makeText(getApplicationContext(),"دخل اليوم صح ياعم",Toast.LENGTH_SHORT).show();
                }

                     month = Integer.parseInt(Month.getText().toString())-1;
                     if (month<=0||month>12)
                     {
                         Toast.makeText(getApplicationContext(),"دخل الشهر صح ياعم",Toast.LENGTH_SHORT).show();
                     }






                int number = MONTH[row][month]+day;

                for(j=0;j<6;j++)
                {
                    if(number==DAY[0][j])
                    {
                        finalresult = "الاحد ";
                    }else if (number==DAY[1][j])
                    {
                        finalresult = "الاثنين ";
                    }else if(number==DAY[2][j])
                    {
                        finalresult = "الثلاثاء ";
                    }else if(number==DAY[3][j])
                    {
                        finalresult = "الاربعاء ";
                    }else if(number==DAY[4][j])
                    {
                        finalresult = "الخميس ";
                    }else if(number==DAY[5][j])
                    {
                        finalresult = "الجمعه ";
                    }else if(number==DAY[6][j])
                    {
                        finalresult = "السبت ";
                    }else {

                    }
                }
                result.setText(finalresult);







            }
        });















    }

}
