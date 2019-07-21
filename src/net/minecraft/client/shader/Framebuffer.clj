(ns net.minecraft.client.shader.Framebuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader Framebuffer]))

(defn ->framebuffer
  "Constructor.

  width - `int`
  height - `int`
  use-depth-in - `boolean`"
  (^Framebuffer [^Integer width ^Integer height ^Boolean use-depth-in]
    (new Framebuffer width height use-depth-in)))

(defn framebuffer-texture-width
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-framebufferTextureWidth)))

(defn framebuffer-texture-height
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-framebufferTextureHeight)))

(defn framebuffer-width
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-framebufferWidth)))

(defn framebuffer-height
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-framebufferHeight)))

(defn use-depth
  "Instance Field.

  type: boolean"
  (^Boolean [^Framebuffer this]
    (-> this .-useDepth)))

(defn framebuffer-object
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-framebufferObject)))

(defn framebuffer-texture
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-framebufferTexture)))

(defn depth-buffer
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-depthBuffer)))

(defn framebuffer-color
  "Instance Field.

  type: float[]"
  ([^Framebuffer this]
    (-> this .-framebufferColor)))

(defn framebuffer-filter
  "Instance Field.

  type: int"
  (^Integer [^Framebuffer this]
    (-> this .-framebufferFilter)))

(defn bind-framebuffer
  "p-147610-1 - `boolean`"
  ([^Framebuffer this ^Boolean p-147610-1]
    (-> this (.bindFramebuffer p-147610-1))))

(defn enable-stencil
  "Attempts to enabled 8 bits of stencil buffer on this FrameBuffer.
   Modders must call this directly to set things up.
   This is to prevent the default cause where graphics cards do not support stencil bits.
   Modders should check the below 'isStencilEnabled' to check if another modder has already enabled them.

   Note:
     As of now the only thing that is checked is if FBOs are supported entirely, in the future
     we may expand to check for errors.

  returns: True if the FBO was re-initialized with stencil bits. - `boolean`"
  (^Boolean [^Framebuffer this]
    (-> this (.enableStencil))))

(defn framebuffer-render-ext
  "width - `int`
  height - `int`
  p-178038-3 - `boolean`"
  ([^Framebuffer this ^Integer width ^Integer height ^Boolean p-178038-3]
    (-> this (.framebufferRenderExt width height p-178038-3))))

(defn check-framebuffer-complete
  ""
  ([^Framebuffer this]
    (-> this (.checkFramebufferComplete))))

(defn set-framebuffer-color
  "red - `float`
  green - `float`
  blue - `float`
  alpha - `float`"
  ([^Framebuffer this ^Float red ^Float green ^Float blue ^Float alpha]
    (-> this (.setFramebufferColor red green blue alpha))))

(defn framebuffer-render
  "width - `int`
  height - `int`"
  ([^Framebuffer this ^Integer width ^Integer height]
    (-> this (.framebufferRender width height))))

(defn bind-framebuffer-texture
  ""
  ([^Framebuffer this]
    (-> this (.bindFramebufferTexture))))

(defn stencil-enabled?
  "Returns wither or not this FBO has been successfully initialized with stencil bits.
   If not, and a modder wishes it to be, they must call enableStencil.

  returns: `boolean`"
  (^Boolean [^Framebuffer this]
    (-> this (.isStencilEnabled))))

(defn framebuffer-clear
  ""
  ([^Framebuffer this]
    (-> this (.framebufferClear))))

(defn set-framebuffer-filter
  "framebuffer-filter-in - `int`"
  ([^Framebuffer this ^Integer framebuffer-filter-in]
    (-> this (.setFramebufferFilter framebuffer-filter-in))))

(defn create-framebuffer
  "width - `int`
  height - `int`"
  ([^Framebuffer this ^Integer width ^Integer height]
    (-> this (.createFramebuffer width height))))

(defn unbind-framebuffer-texture
  ""
  ([^Framebuffer this]
    (-> this (.unbindFramebufferTexture))))

(defn create-bind-framebuffer
  "width - `int`
  height - `int`"
  ([^Framebuffer this ^Integer width ^Integer height]
    (-> this (.createBindFramebuffer width height))))

(defn unbind-framebuffer
  ""
  ([^Framebuffer this]
    (-> this (.unbindFramebuffer))))

(defn delete-framebuffer
  ""
  ([^Framebuffer this]
    (-> this (.deleteFramebuffer))))

