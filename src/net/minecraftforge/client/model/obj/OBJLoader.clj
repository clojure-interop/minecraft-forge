(ns net.minecraftforge.client.model.obj.OBJLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJLoader]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.client.model.obj.OBJLoader"
  OBJLoader/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (OBJLoader c : OBJLoader.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.obj.OBJLoader[]`"
  ([]
    (OBJLoader/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.obj.OBJLoader`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.obj.OBJLoader [^java.lang.String name]
    (OBJLoader/valueOf name)))

(defn add-domain
  "domain - `java.lang.String`"
  ([^OBJLoader this ^java.lang.String domain]
    (-> this (.addDomain domain))))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^OBJLoader this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn accepts
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^OBJLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.accepts model-location))))

(defn load-model
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.IModel`

  throws: java.lang.Exception"
  (^net.minecraftforge.client.model.IModel [^OBJLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.loadModel model-location))))

