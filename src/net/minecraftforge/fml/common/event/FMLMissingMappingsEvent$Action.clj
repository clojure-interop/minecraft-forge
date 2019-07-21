(ns net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLMissingMappingsEvent$Action]))

(def DEFAULT
  "Enum Constant.

  Take the default action

  type: net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action"
  FMLMissingMappingsEvent$Action/DEFAULT)

(def IGNORE
  "Enum Constant.

  Ignore this missing mapping. This means the mapping will be abandoned

  type: net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action"
  FMLMissingMappingsEvent$Action/IGNORE)

(def WARN
  "Enum Constant.

  Generate a warning but allow loading to continue

  type: net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action"
  FMLMissingMappingsEvent$Action/WARN)

(def FAIL
  "Enum Constant.

  Fail to load

  type: net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action"
  FMLMissingMappingsEvent$Action/FAIL)

(def REMAP
  "Enum Constant.

  Remap this name to a new name (add a migration mapping)

  type: net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action"
  FMLMissingMappingsEvent$Action/REMAP)

(def BLOCKONLY
  "Enum Constant.

  Allow a block to exist without itemblock anymore

  type: net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action"
  FMLMissingMappingsEvent$Action/BLOCKONLY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (FMLMissingMappingsEvent.Action c : FMLMissingMappingsEvent.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action[]`"
  ([]
    (FMLMissingMappingsEvent$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action [^java.lang.String name]
    (FMLMissingMappingsEvent$Action/valueOf name)))

