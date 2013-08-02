/*
 * XML Type:  weatherParametersType
 * Namespace: http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd
 * Java type: gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType
 *
 * Automatically generated - do not modify.
 */
package gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.impl;
/**
 * An XML weatherParametersType(@http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd).
 *
 * This is a complex type.
 */
public class WeatherParametersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.weather.graphical.xml.dwmlgen.schema.dwml_xsd.WeatherParametersType
{
    
    public WeatherParametersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXT$0 = 
        new javax.xml.namespace.QName("", "maxt");
    private static final javax.xml.namespace.QName MINT$2 = 
        new javax.xml.namespace.QName("", "mint");
    private static final javax.xml.namespace.QName TEMP$4 = 
        new javax.xml.namespace.QName("", "temp");
    private static final javax.xml.namespace.QName DEW$6 = 
        new javax.xml.namespace.QName("", "dew");
    private static final javax.xml.namespace.QName POP12$8 = 
        new javax.xml.namespace.QName("", "pop12");
    private static final javax.xml.namespace.QName QPF$10 = 
        new javax.xml.namespace.QName("", "qpf");
    private static final javax.xml.namespace.QName SKY$12 = 
        new javax.xml.namespace.QName("", "sky");
    private static final javax.xml.namespace.QName SNOW$14 = 
        new javax.xml.namespace.QName("", "snow");
    private static final javax.xml.namespace.QName WSPD$16 = 
        new javax.xml.namespace.QName("", "wspd");
    private static final javax.xml.namespace.QName WDIR$18 = 
        new javax.xml.namespace.QName("", "wdir");
    private static final javax.xml.namespace.QName WX$20 = 
        new javax.xml.namespace.QName("", "wx");
    private static final javax.xml.namespace.QName WAVEH$22 = 
        new javax.xml.namespace.QName("", "waveh");
    private static final javax.xml.namespace.QName ICONS$24 = 
        new javax.xml.namespace.QName("", "icons");
    private static final javax.xml.namespace.QName RH$26 = 
        new javax.xml.namespace.QName("", "rh");
    private static final javax.xml.namespace.QName APPT$28 = 
        new javax.xml.namespace.QName("", "appt");
    private static final javax.xml.namespace.QName INCW34$30 = 
        new javax.xml.namespace.QName("", "incw34");
    private static final javax.xml.namespace.QName INCW50$32 = 
        new javax.xml.namespace.QName("", "incw50");
    private static final javax.xml.namespace.QName INCW64$34 = 
        new javax.xml.namespace.QName("", "incw64");
    private static final javax.xml.namespace.QName CUMW34$36 = 
        new javax.xml.namespace.QName("", "cumw34");
    private static final javax.xml.namespace.QName CUMW50$38 = 
        new javax.xml.namespace.QName("", "cumw50");
    private static final javax.xml.namespace.QName CUMW64$40 = 
        new javax.xml.namespace.QName("", "cumw64");
    private static final javax.xml.namespace.QName CRITFIREO$42 = 
        new javax.xml.namespace.QName("", "critfireo");
    private static final javax.xml.namespace.QName DRYFIREO$44 = 
        new javax.xml.namespace.QName("", "dryfireo");
    private static final javax.xml.namespace.QName CONHAZO$46 = 
        new javax.xml.namespace.QName("", "conhazo");
    private static final javax.xml.namespace.QName PTORNADO$48 = 
        new javax.xml.namespace.QName("", "ptornado");
    private static final javax.xml.namespace.QName PHAIL$50 = 
        new javax.xml.namespace.QName("", "phail");
    private static final javax.xml.namespace.QName PTSTMWINDS$52 = 
        new javax.xml.namespace.QName("", "ptstmwinds");
    private static final javax.xml.namespace.QName PXTORNADO$54 = 
        new javax.xml.namespace.QName("", "pxtornado");
    private static final javax.xml.namespace.QName PXHAIL$56 = 
        new javax.xml.namespace.QName("", "pxhail");
    private static final javax.xml.namespace.QName PXTSTMWINDS$58 = 
        new javax.xml.namespace.QName("", "pxtstmwinds");
    private static final javax.xml.namespace.QName PTOTSVRTSTM$60 = 
        new javax.xml.namespace.QName("", "ptotsvrtstm");
    private static final javax.xml.namespace.QName PXTOTSVRTSTM$62 = 
        new javax.xml.namespace.QName("", "pxtotsvrtstm");
    private static final javax.xml.namespace.QName TMPABV14D$64 = 
        new javax.xml.namespace.QName("", "tmpabv14d");
    private static final javax.xml.namespace.QName TMPBLW14D$66 = 
        new javax.xml.namespace.QName("", "tmpblw14d");
    private static final javax.xml.namespace.QName TMPABV30D$68 = 
        new javax.xml.namespace.QName("", "tmpabv30d");
    private static final javax.xml.namespace.QName TMPBLW30D$70 = 
        new javax.xml.namespace.QName("", "tmpblw30d");
    private static final javax.xml.namespace.QName TMPABV90D$72 = 
        new javax.xml.namespace.QName("", "tmpabv90d");
    private static final javax.xml.namespace.QName TMPBLW90D$74 = 
        new javax.xml.namespace.QName("", "tmpblw90d");
    private static final javax.xml.namespace.QName PRCPABV14D$76 = 
        new javax.xml.namespace.QName("", "prcpabv14d");
    private static final javax.xml.namespace.QName PRCPBLW14D$78 = 
        new javax.xml.namespace.QName("", "prcpblw14d");
    private static final javax.xml.namespace.QName PRCPABV30D$80 = 
        new javax.xml.namespace.QName("", "prcpabv30d");
    private static final javax.xml.namespace.QName PRCPBLW30D$82 = 
        new javax.xml.namespace.QName("", "prcpblw30d");
    private static final javax.xml.namespace.QName PRCPABV90D$84 = 
        new javax.xml.namespace.QName("", "prcpabv90d");
    private static final javax.xml.namespace.QName PRCPBLW90D$86 = 
        new javax.xml.namespace.QName("", "prcpblw90d");
    private static final javax.xml.namespace.QName PRECIPAR$88 = 
        new javax.xml.namespace.QName("", "precipa_r");
    private static final javax.xml.namespace.QName SKYR$90 = 
        new javax.xml.namespace.QName("", "sky_r");
    private static final javax.xml.namespace.QName TDR$92 = 
        new javax.xml.namespace.QName("", "td_r");
    private static final javax.xml.namespace.QName TEMPR$94 = 
        new javax.xml.namespace.QName("", "temp_r");
    private static final javax.xml.namespace.QName WDIRR$96 = 
        new javax.xml.namespace.QName("", "wdir_r");
    private static final javax.xml.namespace.QName WSPDR$98 = 
        new javax.xml.namespace.QName("", "wspd_r");
    private static final javax.xml.namespace.QName WWA$100 = 
        new javax.xml.namespace.QName("", "wwa");
    private static final javax.xml.namespace.QName TSTMPRB$102 = 
        new javax.xml.namespace.QName("", "tstmprb");
    private static final javax.xml.namespace.QName TSTMCAT$104 = 
        new javax.xml.namespace.QName("", "tstmcat");
    private static final javax.xml.namespace.QName WGUST$106 = 
        new javax.xml.namespace.QName("", "wgust");
    private static final javax.xml.namespace.QName ICEACCUM$108 = 
        new javax.xml.namespace.QName("", "iceaccum");
    
    
    /**
     * Gets the "maxt" element
     */
    public boolean getMaxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxt" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMaxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MAXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxt" element
     */
    public void setMaxt(boolean maxt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXT$0);
            }
            target.setBooleanValue(maxt);
        }
    }
    
    /**
     * Sets (as xml) the "maxt" element
     */
    public void xsetMaxt(org.apache.xmlbeans.XmlBoolean maxt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MAXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MAXT$0);
            }
            target.set(maxt);
        }
    }
    
    /**
     * Gets the "mint" element
     */
    public boolean getMint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mint" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MINT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mint" element
     */
    public void setMint(boolean mint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINT$2);
            }
            target.setBooleanValue(mint);
        }
    }
    
    /**
     * Sets (as xml) the "mint" element
     */
    public void xsetMint(org.apache.xmlbeans.XmlBoolean mint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MINT$2);
            }
            target.set(mint);
        }
    }
    
    /**
     * Gets the "temp" element
     */
    public boolean getTemp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMP$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "temp" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTemp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEMP$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "temp" element
     */
    public void setTemp(boolean temp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMP$4);
            }
            target.setBooleanValue(temp);
        }
    }
    
    /**
     * Sets (as xml) the "temp" element
     */
    public void xsetTemp(org.apache.xmlbeans.XmlBoolean temp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TEMP$4);
            }
            target.set(temp);
        }
    }
    
    /**
     * Gets the "dew" element
     */
    public boolean getDew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEW$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dew" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEW$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dew" element
     */
    public void setDew(boolean dew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEW$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEW$6);
            }
            target.setBooleanValue(dew);
        }
    }
    
    /**
     * Sets (as xml) the "dew" element
     */
    public void xsetDew(org.apache.xmlbeans.XmlBoolean dew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEW$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DEW$6);
            }
            target.set(dew);
        }
    }
    
    /**
     * Gets the "pop12" element
     */
    public boolean getPop12()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POP12$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pop12" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPop12()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POP12$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pop12" element
     */
    public void setPop12(boolean pop12)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POP12$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POP12$8);
            }
            target.setBooleanValue(pop12);
        }
    }
    
    /**
     * Sets (as xml) the "pop12" element
     */
    public void xsetPop12(org.apache.xmlbeans.XmlBoolean pop12)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POP12$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(POP12$8);
            }
            target.set(pop12);
        }
    }
    
    /**
     * Gets the "qpf" element
     */
    public boolean getQpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QPF$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "qpf" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetQpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QPF$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "qpf" element
     */
    public void setQpf(boolean qpf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QPF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QPF$10);
            }
            target.setBooleanValue(qpf);
        }
    }
    
    /**
     * Sets (as xml) the "qpf" element
     */
    public void xsetQpf(org.apache.xmlbeans.XmlBoolean qpf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QPF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(QPF$10);
            }
            target.set(qpf);
        }
    }
    
    /**
     * Gets the "sky" element
     */
    public boolean getSky()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKY$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sky" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSky()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SKY$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sky" element
     */
    public void setSky(boolean sky)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKY$12);
            }
            target.setBooleanValue(sky);
        }
    }
    
    /**
     * Sets (as xml) the "sky" element
     */
    public void xsetSky(org.apache.xmlbeans.XmlBoolean sky)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SKY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SKY$12);
            }
            target.set(sky);
        }
    }
    
    /**
     * Gets the "snow" element
     */
    public boolean getSnow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNOW$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "snow" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSnow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SNOW$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "snow" element
     */
    public void setSnow(boolean snow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNOW$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNOW$14);
            }
            target.setBooleanValue(snow);
        }
    }
    
    /**
     * Sets (as xml) the "snow" element
     */
    public void xsetSnow(org.apache.xmlbeans.XmlBoolean snow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SNOW$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SNOW$14);
            }
            target.set(snow);
        }
    }
    
    /**
     * Gets the "wspd" element
     */
    public boolean getWspd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSPD$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wspd" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWspd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WSPD$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wspd" element
     */
    public void setWspd(boolean wspd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSPD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSPD$16);
            }
            target.setBooleanValue(wspd);
        }
    }
    
    /**
     * Sets (as xml) the "wspd" element
     */
    public void xsetWspd(org.apache.xmlbeans.XmlBoolean wspd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WSPD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WSPD$16);
            }
            target.set(wspd);
        }
    }
    
    /**
     * Gets the "wdir" element
     */
    public boolean getWdir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WDIR$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wdir" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWdir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WDIR$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wdir" element
     */
    public void setWdir(boolean wdir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WDIR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WDIR$18);
            }
            target.setBooleanValue(wdir);
        }
    }
    
    /**
     * Sets (as xml) the "wdir" element
     */
    public void xsetWdir(org.apache.xmlbeans.XmlBoolean wdir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WDIR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WDIR$18);
            }
            target.set(wdir);
        }
    }
    
    /**
     * Gets the "wx" element
     */
    public boolean getWx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WX$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wx" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WX$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wx" element
     */
    public void setWx(boolean wx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WX$20);
            }
            target.setBooleanValue(wx);
        }
    }
    
    /**
     * Sets (as xml) the "wx" element
     */
    public void xsetWx(org.apache.xmlbeans.XmlBoolean wx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WX$20);
            }
            target.set(wx);
        }
    }
    
    /**
     * Gets the "waveh" element
     */
    public boolean getWaveh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAVEH$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "waveh" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWaveh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WAVEH$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "waveh" element
     */
    public void setWaveh(boolean waveh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAVEH$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAVEH$22);
            }
            target.setBooleanValue(waveh);
        }
    }
    
    /**
     * Sets (as xml) the "waveh" element
     */
    public void xsetWaveh(org.apache.xmlbeans.XmlBoolean waveh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WAVEH$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WAVEH$22);
            }
            target.set(waveh);
        }
    }
    
    /**
     * Gets the "icons" element
     */
    public boolean getIcons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONS$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "icons" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIcons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ICONS$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "icons" element
     */
    public void setIcons(boolean icons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICONS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICONS$24);
            }
            target.setBooleanValue(icons);
        }
    }
    
    /**
     * Sets (as xml) the "icons" element
     */
    public void xsetIcons(org.apache.xmlbeans.XmlBoolean icons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ICONS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ICONS$24);
            }
            target.set(icons);
        }
    }
    
    /**
     * Gets the "rh" element
     */
    public boolean getRh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RH$26, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rh" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RH$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rh" element
     */
    public void setRh(boolean rh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RH$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RH$26);
            }
            target.setBooleanValue(rh);
        }
    }
    
    /**
     * Sets (as xml) the "rh" element
     */
    public void xsetRh(org.apache.xmlbeans.XmlBoolean rh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RH$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RH$26);
            }
            target.set(rh);
        }
    }
    
    /**
     * Gets the "appt" element
     */
    public boolean getAppt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPT$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "appt" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAppt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APPT$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "appt" element
     */
    public void setAppt(boolean appt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPT$28);
            }
            target.setBooleanValue(appt);
        }
    }
    
    /**
     * Sets (as xml) the "appt" element
     */
    public void xsetAppt(org.apache.xmlbeans.XmlBoolean appt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APPT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(APPT$28);
            }
            target.set(appt);
        }
    }
    
    /**
     * Gets the "incw34" element
     */
    public boolean getIncw34()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCW34$30, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "incw34" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncw34()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCW34$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "incw34" element
     */
    public void setIncw34(boolean incw34)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCW34$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCW34$30);
            }
            target.setBooleanValue(incw34);
        }
    }
    
    /**
     * Sets (as xml) the "incw34" element
     */
    public void xsetIncw34(org.apache.xmlbeans.XmlBoolean incw34)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCW34$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCW34$30);
            }
            target.set(incw34);
        }
    }
    
    /**
     * Gets the "incw50" element
     */
    public boolean getIncw50()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCW50$32, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "incw50" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncw50()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCW50$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "incw50" element
     */
    public void setIncw50(boolean incw50)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCW50$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCW50$32);
            }
            target.setBooleanValue(incw50);
        }
    }
    
    /**
     * Sets (as xml) the "incw50" element
     */
    public void xsetIncw50(org.apache.xmlbeans.XmlBoolean incw50)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCW50$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCW50$32);
            }
            target.set(incw50);
        }
    }
    
    /**
     * Gets the "incw64" element
     */
    public boolean getIncw64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCW64$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "incw64" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncw64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCW64$34, 0);
            return target;
        }
    }
    
    /**
     * Sets the "incw64" element
     */
    public void setIncw64(boolean incw64)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCW64$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCW64$34);
            }
            target.setBooleanValue(incw64);
        }
    }
    
    /**
     * Sets (as xml) the "incw64" element
     */
    public void xsetIncw64(org.apache.xmlbeans.XmlBoolean incw64)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCW64$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCW64$34);
            }
            target.set(incw64);
        }
    }
    
    /**
     * Gets the "cumw34" element
     */
    public boolean getCumw34()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUMW34$36, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cumw34" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCumw34()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CUMW34$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cumw34" element
     */
    public void setCumw34(boolean cumw34)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUMW34$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUMW34$36);
            }
            target.setBooleanValue(cumw34);
        }
    }
    
    /**
     * Sets (as xml) the "cumw34" element
     */
    public void xsetCumw34(org.apache.xmlbeans.XmlBoolean cumw34)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CUMW34$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CUMW34$36);
            }
            target.set(cumw34);
        }
    }
    
    /**
     * Gets the "cumw50" element
     */
    public boolean getCumw50()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUMW50$38, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cumw50" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCumw50()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CUMW50$38, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cumw50" element
     */
    public void setCumw50(boolean cumw50)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUMW50$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUMW50$38);
            }
            target.setBooleanValue(cumw50);
        }
    }
    
    /**
     * Sets (as xml) the "cumw50" element
     */
    public void xsetCumw50(org.apache.xmlbeans.XmlBoolean cumw50)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CUMW50$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CUMW50$38);
            }
            target.set(cumw50);
        }
    }
    
    /**
     * Gets the "cumw64" element
     */
    public boolean getCumw64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUMW64$40, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cumw64" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCumw64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CUMW64$40, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cumw64" element
     */
    public void setCumw64(boolean cumw64)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUMW64$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUMW64$40);
            }
            target.setBooleanValue(cumw64);
        }
    }
    
    /**
     * Sets (as xml) the "cumw64" element
     */
    public void xsetCumw64(org.apache.xmlbeans.XmlBoolean cumw64)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CUMW64$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CUMW64$40);
            }
            target.set(cumw64);
        }
    }
    
    /**
     * Gets the "critfireo" element
     */
    public boolean getCritfireo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITFIREO$42, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "critfireo" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCritfireo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CRITFIREO$42, 0);
            return target;
        }
    }
    
    /**
     * Sets the "critfireo" element
     */
    public void setCritfireo(boolean critfireo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITFIREO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITFIREO$42);
            }
            target.setBooleanValue(critfireo);
        }
    }
    
    /**
     * Sets (as xml) the "critfireo" element
     */
    public void xsetCritfireo(org.apache.xmlbeans.XmlBoolean critfireo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CRITFIREO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CRITFIREO$42);
            }
            target.set(critfireo);
        }
    }
    
    /**
     * Gets the "dryfireo" element
     */
    public boolean getDryfireo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRYFIREO$44, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dryfireo" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDryfireo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DRYFIREO$44, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dryfireo" element
     */
    public void setDryfireo(boolean dryfireo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRYFIREO$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRYFIREO$44);
            }
            target.setBooleanValue(dryfireo);
        }
    }
    
    /**
     * Sets (as xml) the "dryfireo" element
     */
    public void xsetDryfireo(org.apache.xmlbeans.XmlBoolean dryfireo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DRYFIREO$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DRYFIREO$44);
            }
            target.set(dryfireo);
        }
    }
    
    /**
     * Gets the "conhazo" element
     */
    public boolean getConhazo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONHAZO$46, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "conhazo" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetConhazo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONHAZO$46, 0);
            return target;
        }
    }
    
    /**
     * Sets the "conhazo" element
     */
    public void setConhazo(boolean conhazo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONHAZO$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONHAZO$46);
            }
            target.setBooleanValue(conhazo);
        }
    }
    
    /**
     * Sets (as xml) the "conhazo" element
     */
    public void xsetConhazo(org.apache.xmlbeans.XmlBoolean conhazo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONHAZO$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CONHAZO$46);
            }
            target.set(conhazo);
        }
    }
    
    /**
     * Gets the "ptornado" element
     */
    public boolean getPtornado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PTORNADO$48, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ptornado" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPtornado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PTORNADO$48, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ptornado" element
     */
    public void setPtornado(boolean ptornado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PTORNADO$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PTORNADO$48);
            }
            target.setBooleanValue(ptornado);
        }
    }
    
    /**
     * Sets (as xml) the "ptornado" element
     */
    public void xsetPtornado(org.apache.xmlbeans.XmlBoolean ptornado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PTORNADO$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PTORNADO$48);
            }
            target.set(ptornado);
        }
    }
    
    /**
     * Gets the "phail" element
     */
    public boolean getPhail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHAIL$50, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "phail" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPhail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PHAIL$50, 0);
            return target;
        }
    }
    
    /**
     * Sets the "phail" element
     */
    public void setPhail(boolean phail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHAIL$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHAIL$50);
            }
            target.setBooleanValue(phail);
        }
    }
    
    /**
     * Sets (as xml) the "phail" element
     */
    public void xsetPhail(org.apache.xmlbeans.XmlBoolean phail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PHAIL$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PHAIL$50);
            }
            target.set(phail);
        }
    }
    
    /**
     * Gets the "ptstmwinds" element
     */
    public boolean getPtstmwinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PTSTMWINDS$52, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ptstmwinds" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPtstmwinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PTSTMWINDS$52, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ptstmwinds" element
     */
    public void setPtstmwinds(boolean ptstmwinds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PTSTMWINDS$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PTSTMWINDS$52);
            }
            target.setBooleanValue(ptstmwinds);
        }
    }
    
    /**
     * Sets (as xml) the "ptstmwinds" element
     */
    public void xsetPtstmwinds(org.apache.xmlbeans.XmlBoolean ptstmwinds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PTSTMWINDS$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PTSTMWINDS$52);
            }
            target.set(ptstmwinds);
        }
    }
    
    /**
     * Gets the "pxtornado" element
     */
    public boolean getPxtornado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXTORNADO$54, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pxtornado" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPxtornado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXTORNADO$54, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pxtornado" element
     */
    public void setPxtornado(boolean pxtornado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXTORNADO$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PXTORNADO$54);
            }
            target.setBooleanValue(pxtornado);
        }
    }
    
    /**
     * Sets (as xml) the "pxtornado" element
     */
    public void xsetPxtornado(org.apache.xmlbeans.XmlBoolean pxtornado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXTORNADO$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PXTORNADO$54);
            }
            target.set(pxtornado);
        }
    }
    
    /**
     * Gets the "pxhail" element
     */
    public boolean getPxhail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXHAIL$56, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pxhail" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPxhail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXHAIL$56, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pxhail" element
     */
    public void setPxhail(boolean pxhail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXHAIL$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PXHAIL$56);
            }
            target.setBooleanValue(pxhail);
        }
    }
    
    /**
     * Sets (as xml) the "pxhail" element
     */
    public void xsetPxhail(org.apache.xmlbeans.XmlBoolean pxhail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXHAIL$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PXHAIL$56);
            }
            target.set(pxhail);
        }
    }
    
    /**
     * Gets the "pxtstmwinds" element
     */
    public boolean getPxtstmwinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXTSTMWINDS$58, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pxtstmwinds" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPxtstmwinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXTSTMWINDS$58, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pxtstmwinds" element
     */
    public void setPxtstmwinds(boolean pxtstmwinds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXTSTMWINDS$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PXTSTMWINDS$58);
            }
            target.setBooleanValue(pxtstmwinds);
        }
    }
    
    /**
     * Sets (as xml) the "pxtstmwinds" element
     */
    public void xsetPxtstmwinds(org.apache.xmlbeans.XmlBoolean pxtstmwinds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXTSTMWINDS$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PXTSTMWINDS$58);
            }
            target.set(pxtstmwinds);
        }
    }
    
    /**
     * Gets the "ptotsvrtstm" element
     */
    public boolean getPtotsvrtstm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PTOTSVRTSTM$60, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ptotsvrtstm" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPtotsvrtstm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PTOTSVRTSTM$60, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ptotsvrtstm" element
     */
    public void setPtotsvrtstm(boolean ptotsvrtstm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PTOTSVRTSTM$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PTOTSVRTSTM$60);
            }
            target.setBooleanValue(ptotsvrtstm);
        }
    }
    
    /**
     * Sets (as xml) the "ptotsvrtstm" element
     */
    public void xsetPtotsvrtstm(org.apache.xmlbeans.XmlBoolean ptotsvrtstm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PTOTSVRTSTM$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PTOTSVRTSTM$60);
            }
            target.set(ptotsvrtstm);
        }
    }
    
    /**
     * Gets the "pxtotsvrtstm" element
     */
    public boolean getPxtotsvrtstm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXTOTSVRTSTM$62, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pxtotsvrtstm" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPxtotsvrtstm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXTOTSVRTSTM$62, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pxtotsvrtstm" element
     */
    public void setPxtotsvrtstm(boolean pxtotsvrtstm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PXTOTSVRTSTM$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PXTOTSVRTSTM$62);
            }
            target.setBooleanValue(pxtotsvrtstm);
        }
    }
    
    /**
     * Sets (as xml) the "pxtotsvrtstm" element
     */
    public void xsetPxtotsvrtstm(org.apache.xmlbeans.XmlBoolean pxtotsvrtstm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PXTOTSVRTSTM$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PXTOTSVRTSTM$62);
            }
            target.set(pxtotsvrtstm);
        }
    }
    
    /**
     * Gets the "tmpabv14d" element
     */
    public boolean getTmpabv14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPABV14D$64, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tmpabv14d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTmpabv14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPABV14D$64, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tmpabv14d" element
     */
    public void setTmpabv14D(boolean tmpabv14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPABV14D$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPABV14D$64);
            }
            target.setBooleanValue(tmpabv14D);
        }
    }
    
    /**
     * Sets (as xml) the "tmpabv14d" element
     */
    public void xsetTmpabv14D(org.apache.xmlbeans.XmlBoolean tmpabv14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPABV14D$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TMPABV14D$64);
            }
            target.set(tmpabv14D);
        }
    }
    
    /**
     * Gets the "tmpblw14d" element
     */
    public boolean getTmpblw14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPBLW14D$66, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tmpblw14d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTmpblw14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPBLW14D$66, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tmpblw14d" element
     */
    public void setTmpblw14D(boolean tmpblw14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPBLW14D$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPBLW14D$66);
            }
            target.setBooleanValue(tmpblw14D);
        }
    }
    
    /**
     * Sets (as xml) the "tmpblw14d" element
     */
    public void xsetTmpblw14D(org.apache.xmlbeans.XmlBoolean tmpblw14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPBLW14D$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TMPBLW14D$66);
            }
            target.set(tmpblw14D);
        }
    }
    
    /**
     * Gets the "tmpabv30d" element
     */
    public boolean getTmpabv30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPABV30D$68, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tmpabv30d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTmpabv30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPABV30D$68, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tmpabv30d" element
     */
    public void setTmpabv30D(boolean tmpabv30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPABV30D$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPABV30D$68);
            }
            target.setBooleanValue(tmpabv30D);
        }
    }
    
    /**
     * Sets (as xml) the "tmpabv30d" element
     */
    public void xsetTmpabv30D(org.apache.xmlbeans.XmlBoolean tmpabv30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPABV30D$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TMPABV30D$68);
            }
            target.set(tmpabv30D);
        }
    }
    
    /**
     * Gets the "tmpblw30d" element
     */
    public boolean getTmpblw30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPBLW30D$70, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tmpblw30d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTmpblw30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPBLW30D$70, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tmpblw30d" element
     */
    public void setTmpblw30D(boolean tmpblw30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPBLW30D$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPBLW30D$70);
            }
            target.setBooleanValue(tmpblw30D);
        }
    }
    
    /**
     * Sets (as xml) the "tmpblw30d" element
     */
    public void xsetTmpblw30D(org.apache.xmlbeans.XmlBoolean tmpblw30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPBLW30D$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TMPBLW30D$70);
            }
            target.set(tmpblw30D);
        }
    }
    
    /**
     * Gets the "tmpabv90d" element
     */
    public boolean getTmpabv90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPABV90D$72, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tmpabv90d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTmpabv90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPABV90D$72, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tmpabv90d" element
     */
    public void setTmpabv90D(boolean tmpabv90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPABV90D$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPABV90D$72);
            }
            target.setBooleanValue(tmpabv90D);
        }
    }
    
    /**
     * Sets (as xml) the "tmpabv90d" element
     */
    public void xsetTmpabv90D(org.apache.xmlbeans.XmlBoolean tmpabv90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPABV90D$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TMPABV90D$72);
            }
            target.set(tmpabv90D);
        }
    }
    
    /**
     * Gets the "tmpblw90d" element
     */
    public boolean getTmpblw90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPBLW90D$74, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tmpblw90d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTmpblw90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPBLW90D$74, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tmpblw90d" element
     */
    public void setTmpblw90D(boolean tmpblw90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPBLW90D$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPBLW90D$74);
            }
            target.setBooleanValue(tmpblw90D);
        }
    }
    
    /**
     * Sets (as xml) the "tmpblw90d" element
     */
    public void xsetTmpblw90D(org.apache.xmlbeans.XmlBoolean tmpblw90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TMPBLW90D$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TMPBLW90D$74);
            }
            target.set(tmpblw90D);
        }
    }
    
    /**
     * Gets the "prcpabv14d" element
     */
    public boolean getPrcpabv14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPABV14D$76, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "prcpabv14d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrcpabv14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPABV14D$76, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prcpabv14d" element
     */
    public void setPrcpabv14D(boolean prcpabv14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPABV14D$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRCPABV14D$76);
            }
            target.setBooleanValue(prcpabv14D);
        }
    }
    
    /**
     * Sets (as xml) the "prcpabv14d" element
     */
    public void xsetPrcpabv14D(org.apache.xmlbeans.XmlBoolean prcpabv14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPABV14D$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRCPABV14D$76);
            }
            target.set(prcpabv14D);
        }
    }
    
    /**
     * Gets the "prcpblw14d" element
     */
    public boolean getPrcpblw14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPBLW14D$78, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "prcpblw14d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrcpblw14D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPBLW14D$78, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prcpblw14d" element
     */
    public void setPrcpblw14D(boolean prcpblw14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPBLW14D$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRCPBLW14D$78);
            }
            target.setBooleanValue(prcpblw14D);
        }
    }
    
    /**
     * Sets (as xml) the "prcpblw14d" element
     */
    public void xsetPrcpblw14D(org.apache.xmlbeans.XmlBoolean prcpblw14D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPBLW14D$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRCPBLW14D$78);
            }
            target.set(prcpblw14D);
        }
    }
    
    /**
     * Gets the "prcpabv30d" element
     */
    public boolean getPrcpabv30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPABV30D$80, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "prcpabv30d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrcpabv30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPABV30D$80, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prcpabv30d" element
     */
    public void setPrcpabv30D(boolean prcpabv30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPABV30D$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRCPABV30D$80);
            }
            target.setBooleanValue(prcpabv30D);
        }
    }
    
    /**
     * Sets (as xml) the "prcpabv30d" element
     */
    public void xsetPrcpabv30D(org.apache.xmlbeans.XmlBoolean prcpabv30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPABV30D$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRCPABV30D$80);
            }
            target.set(prcpabv30D);
        }
    }
    
    /**
     * Gets the "prcpblw30d" element
     */
    public boolean getPrcpblw30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPBLW30D$82, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "prcpblw30d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrcpblw30D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPBLW30D$82, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prcpblw30d" element
     */
    public void setPrcpblw30D(boolean prcpblw30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPBLW30D$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRCPBLW30D$82);
            }
            target.setBooleanValue(prcpblw30D);
        }
    }
    
    /**
     * Sets (as xml) the "prcpblw30d" element
     */
    public void xsetPrcpblw30D(org.apache.xmlbeans.XmlBoolean prcpblw30D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPBLW30D$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRCPBLW30D$82);
            }
            target.set(prcpblw30D);
        }
    }
    
    /**
     * Gets the "prcpabv90d" element
     */
    public boolean getPrcpabv90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPABV90D$84, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "prcpabv90d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrcpabv90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPABV90D$84, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prcpabv90d" element
     */
    public void setPrcpabv90D(boolean prcpabv90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPABV90D$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRCPABV90D$84);
            }
            target.setBooleanValue(prcpabv90D);
        }
    }
    
    /**
     * Sets (as xml) the "prcpabv90d" element
     */
    public void xsetPrcpabv90D(org.apache.xmlbeans.XmlBoolean prcpabv90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPABV90D$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRCPABV90D$84);
            }
            target.set(prcpabv90D);
        }
    }
    
    /**
     * Gets the "prcpblw90d" element
     */
    public boolean getPrcpblw90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPBLW90D$86, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "prcpblw90d" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrcpblw90D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPBLW90D$86, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prcpblw90d" element
     */
    public void setPrcpblw90D(boolean prcpblw90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRCPBLW90D$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRCPBLW90D$86);
            }
            target.setBooleanValue(prcpblw90D);
        }
    }
    
    /**
     * Sets (as xml) the "prcpblw90d" element
     */
    public void xsetPrcpblw90D(org.apache.xmlbeans.XmlBoolean prcpblw90D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRCPBLW90D$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRCPBLW90D$86);
            }
            target.set(prcpblw90D);
        }
    }
    
    /**
     * Gets the "precipa_r" element
     */
    public boolean getPrecipaR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIPAR$88, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "precipa_r" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrecipaR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRECIPAR$88, 0);
            return target;
        }
    }
    
    /**
     * Sets the "precipa_r" element
     */
    public void setPrecipaR(boolean precipaR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIPAR$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECIPAR$88);
            }
            target.setBooleanValue(precipaR);
        }
    }
    
    /**
     * Sets (as xml) the "precipa_r" element
     */
    public void xsetPrecipaR(org.apache.xmlbeans.XmlBoolean precipaR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRECIPAR$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRECIPAR$88);
            }
            target.set(precipaR);
        }
    }
    
    /**
     * Gets the "sky_r" element
     */
    public boolean getSkyR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKYR$90, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sky_r" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSkyR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SKYR$90, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sky_r" element
     */
    public void setSkyR(boolean skyR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKYR$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKYR$90);
            }
            target.setBooleanValue(skyR);
        }
    }
    
    /**
     * Sets (as xml) the "sky_r" element
     */
    public void xsetSkyR(org.apache.xmlbeans.XmlBoolean skyR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SKYR$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SKYR$90);
            }
            target.set(skyR);
        }
    }
    
    /**
     * Gets the "td_r" element
     */
    public boolean getTdR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TDR$92, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "td_r" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTdR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TDR$92, 0);
            return target;
        }
    }
    
    /**
     * Sets the "td_r" element
     */
    public void setTdR(boolean tdR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TDR$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TDR$92);
            }
            target.setBooleanValue(tdR);
        }
    }
    
    /**
     * Sets (as xml) the "td_r" element
     */
    public void xsetTdR(org.apache.xmlbeans.XmlBoolean tdR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TDR$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TDR$92);
            }
            target.set(tdR);
        }
    }
    
    /**
     * Gets the "temp_r" element
     */
    public boolean getTempR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPR$94, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "temp_r" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTempR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEMPR$94, 0);
            return target;
        }
    }
    
    /**
     * Sets the "temp_r" element
     */
    public void setTempR(boolean tempR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPR$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPR$94);
            }
            target.setBooleanValue(tempR);
        }
    }
    
    /**
     * Sets (as xml) the "temp_r" element
     */
    public void xsetTempR(org.apache.xmlbeans.XmlBoolean tempR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEMPR$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TEMPR$94);
            }
            target.set(tempR);
        }
    }
    
    /**
     * Gets the "wdir_r" element
     */
    public boolean getWdirR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WDIRR$96, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wdir_r" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWdirR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WDIRR$96, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wdir_r" element
     */
    public void setWdirR(boolean wdirR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WDIRR$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WDIRR$96);
            }
            target.setBooleanValue(wdirR);
        }
    }
    
    /**
     * Sets (as xml) the "wdir_r" element
     */
    public void xsetWdirR(org.apache.xmlbeans.XmlBoolean wdirR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WDIRR$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WDIRR$96);
            }
            target.set(wdirR);
        }
    }
    
    /**
     * Gets the "wspd_r" element
     */
    public boolean getWspdR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSPDR$98, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wspd_r" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWspdR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WSPDR$98, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wspd_r" element
     */
    public void setWspdR(boolean wspdR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSPDR$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSPDR$98);
            }
            target.setBooleanValue(wspdR);
        }
    }
    
    /**
     * Sets (as xml) the "wspd_r" element
     */
    public void xsetWspdR(org.apache.xmlbeans.XmlBoolean wspdR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WSPDR$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WSPDR$98);
            }
            target.set(wspdR);
        }
    }
    
    /**
     * Gets the "wwa" element
     */
    public boolean getWwa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WWA$100, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wwa" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWwa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WWA$100, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wwa" element
     */
    public void setWwa(boolean wwa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WWA$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WWA$100);
            }
            target.setBooleanValue(wwa);
        }
    }
    
    /**
     * Sets (as xml) the "wwa" element
     */
    public void xsetWwa(org.apache.xmlbeans.XmlBoolean wwa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WWA$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WWA$100);
            }
            target.set(wwa);
        }
    }
    
    /**
     * Gets the "tstmprb" element
     */
    public boolean getTstmprb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSTMPRB$102, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tstmprb" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTstmprb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TSTMPRB$102, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tstmprb" element
     */
    public void setTstmprb(boolean tstmprb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSTMPRB$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TSTMPRB$102);
            }
            target.setBooleanValue(tstmprb);
        }
    }
    
    /**
     * Sets (as xml) the "tstmprb" element
     */
    public void xsetTstmprb(org.apache.xmlbeans.XmlBoolean tstmprb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TSTMPRB$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TSTMPRB$102);
            }
            target.set(tstmprb);
        }
    }
    
    /**
     * Gets the "tstmcat" element
     */
    public boolean getTstmcat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSTMCAT$104, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tstmcat" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTstmcat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TSTMCAT$104, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tstmcat" element
     */
    public void setTstmcat(boolean tstmcat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSTMCAT$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TSTMCAT$104);
            }
            target.setBooleanValue(tstmcat);
        }
    }
    
    /**
     * Sets (as xml) the "tstmcat" element
     */
    public void xsetTstmcat(org.apache.xmlbeans.XmlBoolean tstmcat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TSTMCAT$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TSTMCAT$104);
            }
            target.set(tstmcat);
        }
    }
    
    /**
     * Gets the "wgust" element
     */
    public boolean getWgust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WGUST$106, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wgust" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWgust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WGUST$106, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wgust" element
     */
    public void setWgust(boolean wgust)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WGUST$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WGUST$106);
            }
            target.setBooleanValue(wgust);
        }
    }
    
    /**
     * Sets (as xml) the "wgust" element
     */
    public void xsetWgust(org.apache.xmlbeans.XmlBoolean wgust)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WGUST$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WGUST$106);
            }
            target.set(wgust);
        }
    }
    
    /**
     * Gets the "iceaccum" element
     */
    public boolean getIceaccum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICEACCUM$108, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "iceaccum" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIceaccum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ICEACCUM$108, 0);
            return target;
        }
    }
    
    /**
     * Sets the "iceaccum" element
     */
    public void setIceaccum(boolean iceaccum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICEACCUM$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICEACCUM$108);
            }
            target.setBooleanValue(iceaccum);
        }
    }
    
    /**
     * Sets (as xml) the "iceaccum" element
     */
    public void xsetIceaccum(org.apache.xmlbeans.XmlBoolean iceaccum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ICEACCUM$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ICEACCUM$108);
            }
            target.set(iceaccum);
        }
    }
}
