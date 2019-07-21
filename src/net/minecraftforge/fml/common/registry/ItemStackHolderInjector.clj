(ns net.minecraftforge.fml.common.registry.ItemStackHolderInjector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry ItemStackHolderInjector]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.fml.common.registry.ItemStackHolderInjector"
  ItemStackHolderInjector/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ItemStackHolderInjector c : ItemStackHolderInjector.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.registry.ItemStackHolderInjector[]`"
  ([]
    (ItemStackHolderInjector/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.registry.ItemStackHolderInjector`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.registry.ItemStackHolderInjector [^java.lang.String name]
    (ItemStackHolderInjector/valueOf name)))

(defn inject
  ""
  ([^ItemStackHolderInjector this]
    (-> this (.inject))))

(defn find-holders
  "table - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  ([^ItemStackHolderInjector this ^net.minecraftforge.fml.common.discovery.ASMDataTable table]
    (-> this (.findHolders table))))

