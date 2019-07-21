(ns net.minecraftforge.fml.common.discovery.ContainerType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery ContainerType]))

(def JAR
  "Enum Constant.

  type: net.minecraftforge.fml.common.discovery.ContainerType"
  ContainerType/JAR)

(def DIR
  "Enum Constant.

  type: net.minecraftforge.fml.common.discovery.ContainerType"
  ContainerType/DIR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ContainerType c : ContainerType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.discovery.ContainerType[]`"
  ([]
    (ContainerType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.discovery.ContainerType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.discovery.ContainerType [^java.lang.String name]
    (ContainerType/valueOf name)))

(defn find-mods
  "candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`
  table - `net.minecraftforge.fml.common.discovery.ASMDataTable`

  returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^ContainerType this ^net.minecraftforge.fml.common.discovery.ModCandidate candidate ^net.minecraftforge.fml.common.discovery.ASMDataTable table]
    (-> this (.findMods candidate table))))

