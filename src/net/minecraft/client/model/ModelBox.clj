(ns net.minecraft.client.model.ModelBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelBox]))

(defn ->model-box
  "Constructor.

  renderer - `net.minecraft.client.model.ModelRenderer`
  tex-u - `int`
  tex-v - `int`
  x - `float`
  y - `float`
  z - `float`
  dx - `int`
  dy - `int`
  dz - `int`
  delta - `float`
  mirror - `boolean`"
  (^ModelBox [^net.minecraft.client.model.ModelRenderer renderer ^Integer tex-u ^Integer tex-v ^Float x ^Float y ^Float z ^Integer dx ^Integer dy ^Integer dz ^Float delta ^Boolean mirror]
    (new ModelBox renderer tex-u tex-v x y z dx dy dz delta mirror))
  (^ModelBox [^net.minecraft.client.model.ModelRenderer renderer ^Integer tex-u ^Integer tex-v ^Float x ^Float y ^Float z ^Integer dx ^Integer dy ^Integer dz ^Float delta]
    (new ModelBox renderer tex-u tex-v x y z dx dy dz delta)))

(defn pos-x-1
  "Instance Constant.

  type: float"
  (^Float [^ModelBox this]
    (-> this .-posX1)))

(defn pos-y-1
  "Instance Constant.

  type: float"
  (^Float [^ModelBox this]
    (-> this .-posY1)))

(defn pos-z-1
  "Instance Constant.

  type: float"
  (^Float [^ModelBox this]
    (-> this .-posZ1)))

(defn pos-x-2
  "Instance Constant.

  type: float"
  (^Float [^ModelBox this]
    (-> this .-posX2)))

(defn pos-y-2
  "Instance Constant.

  type: float"
  (^Float [^ModelBox this]
    (-> this .-posY2)))

(defn pos-z-2
  "Instance Constant.

  type: float"
  (^Float [^ModelBox this]
    (-> this .-posZ2)))

(defn box-name
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ModelBox this]
    (-> this .-boxName)))

(defn render
  "renderer - `net.minecraft.client.renderer.VertexBuffer`
  scale - `float`"
  ([^ModelBox this ^net.minecraft.client.renderer.VertexBuffer renderer ^Float scale]
    (-> this (.render renderer scale))))

(defn set-box-name
  "name - `java.lang.String`

  returns: `net.minecraft.client.model.ModelBox`"
  (^net.minecraft.client.model.ModelBox [^ModelBox this ^java.lang.String name]
    (-> this (.setBoxName name))))

