package scs.instrumentation;

/**
* scs/instrumentation/MethodStatsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class MethodStatsHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.instrumentation.MethodStats value = null;

  public MethodStatsHolder ()
  {
  }

  public MethodStatsHolder (scs.instrumentation.MethodStats initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.instrumentation.MethodStatsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.instrumentation.MethodStatsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.instrumentation.MethodStatsHelper.type ();
  }

}