package scs.container;

/**
* scs/container/ComponentLoaderHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class ComponentLoaderHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.container.ComponentLoader value = null;

  public ComponentLoaderHolder ()
  {
  }

  public ComponentLoaderHolder (scs.container.ComponentLoader initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.container.ComponentLoaderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.container.ComponentLoaderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.container.ComponentLoaderHelper.type ();
  }

}