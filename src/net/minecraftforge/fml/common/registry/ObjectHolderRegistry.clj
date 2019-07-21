(ns net.minecraftforge.fml.common.registry.ObjectHolderRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry ObjectHolderRegistry]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.fml.common.registry.ObjectHolderRegistry"
  ObjectHolderRegistry/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ObjectHolderRegistry c : ObjectHolderRegistry.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.registry.ObjectHolderRegistry[]`"
  ([]
    (ObjectHolderRegistry/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.registry.ObjectHolderRegistry`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.registry.ObjectHolderRegistry [^java.lang.String name]
    (ObjectHolderRegistry/valueOf name)))

(defn find-object-holders
  "table - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  ([^ObjectHolderRegistry this ^net.minecraftforge.fml.common.discovery.ASMDataTable table]
    (-> this (.findObjectHolders table))))

(defn apply-object-holders
  ""
  ([^ObjectHolderRegistry this]
    (-> this (.applyObjectHolders))))

