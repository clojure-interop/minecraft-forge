(ns net.minecraft.client.model.ModelRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelRenderer]))

(defn ->model-renderer
  "Constructor.

  model - `net.minecraft.client.model.ModelBase`
  tex-off-x - `int`
  tex-off-y - `int`"
  (^ModelRenderer [^net.minecraft.client.model.ModelBase model ^Integer tex-off-x ^Integer tex-off-y]
    (new ModelRenderer model tex-off-x tex-off-y))
  (^ModelRenderer [^net.minecraft.client.model.ModelBase model ^java.lang.String box-name-in]
    (new ModelRenderer model box-name-in))
  (^ModelRenderer [^net.minecraft.client.model.ModelBase model]
    (new ModelRenderer model)))

(defn texture-width
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-textureWidth)))

(defn texture-height
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-textureHeight)))

(defn rotation-point-x
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-rotationPointX)))

(defn rotation-point-y
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-rotationPointY)))

(defn rotation-point-z
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-rotationPointZ)))

(defn rotate-angle-x
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-rotateAngleX)))

(defn rotate-angle-y
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-rotateAngleY)))

(defn rotate-angle-z
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-rotateAngleZ)))

(defn mirror
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelRenderer this]
    (-> this .-mirror)))

(defn show-model
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelRenderer this]
    (-> this .-showModel)))

(defn is-hidden
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelRenderer this]
    (-> this .-isHidden)))

(defn cube-list
  "Instance Field.

  type: java.util.List<net.minecraft.client.model.ModelBox>"
  (^java.util.List [^ModelRenderer this]
    (-> this .-cubeList)))

(defn child-models
  "Instance Field.

  type: java.util.List<net.minecraft.client.model.ModelRenderer>"
  (^java.util.List [^ModelRenderer this]
    (-> this .-childModels)))

(defn box-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ModelRenderer this]
    (-> this .-boxName)))

(defn offset-x
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-offsetX)))

(defn offset-y
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-offsetY)))

(defn offset-z
  "Instance Field.

  type: float"
  (^Float [^ModelRenderer this]
    (-> this .-offsetZ)))

(defn add-child
  "renderer - `net.minecraft.client.model.ModelRenderer`"
  ([^ModelRenderer this ^net.minecraft.client.model.ModelRenderer renderer]
    (-> this (.addChild renderer))))

(defn set-texture-offset
  "x - `int`
  y - `int`

  returns: `net.minecraft.client.model.ModelRenderer`"
  (^net.minecraft.client.model.ModelRenderer [^ModelRenderer this ^Integer x ^Integer y]
    (-> this (.setTextureOffset x y))))

(defn add-box
  "part-name - `java.lang.String`
  off-x - `float`
  off-y - `float`
  off-z - `float`
  width - `int`
  height - `int`
  depth - `int`

  returns: `net.minecraft.client.model.ModelRenderer`"
  (^net.minecraft.client.model.ModelRenderer [^ModelRenderer this ^java.lang.String part-name ^Float off-x ^Float off-y ^Float off-z ^Integer width ^Integer height ^Integer depth]
    (-> this (.addBox part-name off-x off-y off-z width height depth)))
  (^net.minecraft.client.model.ModelRenderer [^ModelRenderer this ^Float off-x ^Float off-y ^Float off-z ^Integer width ^Integer height ^Integer depth]
    (-> this (.addBox off-x off-y off-z width height depth))))

(defn set-rotation-point
  "rotation-point-x-in - `float`
  rotation-point-y-in - `float`
  rotation-point-z-in - `float`"
  ([^ModelRenderer this ^Float rotation-point-x-in ^Float rotation-point-y-in ^Float rotation-point-z-in]
    (-> this (.setRotationPoint rotation-point-x-in rotation-point-y-in rotation-point-z-in))))

(defn render
  "scale - `float`"
  ([^ModelRenderer this ^Float scale]
    (-> this (.render scale))))

(defn render-with-rotation
  "scale - `float`"
  ([^ModelRenderer this ^Float scale]
    (-> this (.renderWithRotation scale))))

(defn post-render
  "scale - `float`"
  ([^ModelRenderer this ^Float scale]
    (-> this (.postRender scale))))

(defn set-texture-size
  "texture-width-in - `int`
  texture-height-in - `int`

  returns: `net.minecraft.client.model.ModelRenderer`"
  (^net.minecraft.client.model.ModelRenderer [^ModelRenderer this ^Integer texture-width-in ^Integer texture-height-in]
    (-> this (.setTextureSize texture-width-in texture-height-in))))

