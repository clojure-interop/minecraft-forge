(ns net.minecraftforge.client.model.b3d.B3DLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DLoader]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.client.model.b3d.B3DLoader"
  B3DLoader/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (B3DLoader c : B3DLoader.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.b3d.B3DLoader[]`"
  ([]
    (B3DLoader/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.b3d.B3DLoader`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.b3d.B3DLoader [^java.lang.String name]
    (B3DLoader/valueOf name)))

(defn add-domain
  "domain - `java.lang.String`"
  ([^B3DLoader this ^java.lang.String domain]
    (-> this (.addDomain domain))))

(defn on-resource-manager-reload
  "manager - `net.minecraft.client.resources.IResourceManager`"
  ([^B3DLoader this ^net.minecraft.client.resources.IResourceManager manager]
    (-> this (.onResourceManagerReload manager))))

(defn accepts
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^B3DLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.accepts model-location))))

(defn load-model
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.IModel`

  throws: java.lang.Exception"
  (^net.minecraftforge.client.model.IModel [^B3DLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.loadModel model-location))))

