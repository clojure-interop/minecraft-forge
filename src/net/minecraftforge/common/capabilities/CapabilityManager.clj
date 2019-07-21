(ns net.minecraftforge.common.capabilities.CapabilityManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.capabilities CapabilityManager]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.common.capabilities.CapabilityManager"
  CapabilityManager/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CapabilityManager c : CapabilityManager.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.capabilities.CapabilityManager[]`"
  ([]
    (CapabilityManager/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.capabilities.CapabilityManager`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.capabilities.CapabilityManager [^java.lang.String name]
    (CapabilityManager/valueOf name)))

(defn register
  "Registers a capability to be consumed by others.
   APIs who define the capability should call this.
   To retrieve the Capability instance, use the @CapabilityInject annotation.

  type - The Interface to be registered - `java.lang.Class`
  storage - A default implementation of the storage handler. - `net.minecraftforge.common.capabilities.Capability$IStorage`
  implementation - A default implementation of the interface. - `java.lang.Class`

  returns: `<T> void`"
  ([^CapabilityManager this ^java.lang.Class type ^net.minecraftforge.common.capabilities.Capability$IStorage storage ^java.lang.Class implementation]
    (-> this (.register type storage implementation))))

(defn inject-capabilities
  "data - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  ([^CapabilityManager this ^net.minecraftforge.fml.common.discovery.ASMDataTable data]
    (-> this (.injectCapabilities data))))

