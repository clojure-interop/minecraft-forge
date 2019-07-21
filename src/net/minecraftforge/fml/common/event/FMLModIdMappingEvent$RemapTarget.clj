(ns net.minecraftforge.fml.common.event.FMLModIdMappingEvent$RemapTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLModIdMappingEvent$RemapTarget]))

(def BLOCK
  "Enum Constant.

  type: net.minecraftforge.fml.common.event.FMLModIdMappingEvent$RemapTarget"
  FMLModIdMappingEvent$RemapTarget/BLOCK)

(def ITEM
  "Enum Constant.

  type: net.minecraftforge.fml.common.event.FMLModIdMappingEvent$RemapTarget"
  FMLModIdMappingEvent$RemapTarget/ITEM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (FMLModIdMappingEvent.RemapTarget c : FMLModIdMappingEvent.RemapTarget.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.event.FMLModIdMappingEvent$RemapTarget[]`"
  ([]
    (FMLModIdMappingEvent$RemapTarget/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.event.FMLModIdMappingEvent$RemapTarget`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.event.FMLModIdMappingEvent$RemapTarget [^java.lang.String name]
    (FMLModIdMappingEvent$RemapTarget/valueOf name)))

