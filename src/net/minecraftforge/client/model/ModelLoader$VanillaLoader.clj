(ns net.minecraftforge.client.model.ModelLoader$VanillaLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelLoader$VanillaLoader]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.client.model.ModelLoader$VanillaLoader"
  ModelLoader$VanillaLoader/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ModelLoader.VanillaLoader c : ModelLoader.VanillaLoader.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.ModelLoader$VanillaLoader[]`"
  ([]
    (ModelLoader$VanillaLoader/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.ModelLoader$VanillaLoader`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.ModelLoader$VanillaLoader [^java.lang.String name]
    (ModelLoader$VanillaLoader/valueOf name)))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^ModelLoader$VanillaLoader this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn accepts
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^ModelLoader$VanillaLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.accepts model-location))))

(defn load-model
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.IModel`

  throws: java.lang.Exception"
  (^net.minecraftforge.client.model.IModel [^ModelLoader$VanillaLoader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.loadModel model-location))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ModelLoader$VanillaLoader this]
    (-> this (.toString))))

