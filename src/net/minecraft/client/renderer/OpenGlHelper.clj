(ns net.minecraft.client.renderer.OpenGlHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer OpenGlHelper]))

(defn ->open-gl-helper
  "Constructor."
  (^OpenGlHelper []
    (new OpenGlHelper )))

(defn *-nvidia
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/nvidia)

(defn *-ati
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/ati)

(defn *-gl-framebuffer
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_FRAMEBUFFER)

(defn *-gl-renderbuffer
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_RENDERBUFFER)

(defn *-gl-color-attachment-0
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_COLOR_ATTACHMENT0)

(defn *-gl-depth-attachment
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_DEPTH_ATTACHMENT)

(defn *-gl-framebuffer-complete
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_FRAMEBUFFER_COMPLETE)

(defn *-gl-fb-incomplete-attachment
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_FB_INCOMPLETE_ATTACHMENT)

(defn *-gl-fb-incomplete-miss-attach
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_FB_INCOMPLETE_MISS_ATTACH)

(defn *-gl-fb-incomplete-draw-buffer
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_FB_INCOMPLETE_DRAW_BUFFER)

(defn *-gl-fb-incomplete-read-buffer
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_FB_INCOMPLETE_READ_BUFFER)

(defn *-framebuffer-supported
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/framebufferSupported)

(defn *-gl-link-status
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_LINK_STATUS)

(defn *-gl-compile-status
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_COMPILE_STATUS)

(defn *-gl-vertex-shader
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_VERTEX_SHADER)

(defn *-gl-fragment-shader
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_FRAGMENT_SHADER)

(defn *-default-tex-unit
  "Static Field.

  type: int"
  []
  OpenGlHelper/defaultTexUnit)

(defn *-lightmap-tex-unit
  "Static Field.

  type: int"
  []
  OpenGlHelper/lightmapTexUnit)

(defn *-gl-texture-2
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_TEXTURE2)

(defn *-gl-combine
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_COMBINE)

(defn *-gl-interpolate
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_INTERPOLATE)

(defn *-gl-primary-color
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_PRIMARY_COLOR)

(defn *-gl-constant
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_CONSTANT)

(defn *-gl-previous
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_PREVIOUS)

(defn *-gl-combine-rgb
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_COMBINE_RGB)

(defn *-gl-source-0-rgb
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_SOURCE0_RGB)

(defn *-gl-source-1-rgb
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_SOURCE1_RGB)

(defn *-gl-source-2-rgb
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_SOURCE2_RGB)

(defn *-gl-operand-0-rgb
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_OPERAND0_RGB)

(defn *-gl-operand-1-rgb
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_OPERAND1_RGB)

(defn *-gl-operand-2-rgb
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_OPERAND2_RGB)

(defn *-gl-combine-alpha
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_COMBINE_ALPHA)

(defn *-gl-source-0-alpha
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_SOURCE0_ALPHA)

(defn *-gl-source-1-alpha
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_SOURCE1_ALPHA)

(defn *-gl-source-2-alpha
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_SOURCE2_ALPHA)

(defn *-gl-operand-0-alpha
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_OPERAND0_ALPHA)

(defn *-gl-operand-1-alpha
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_OPERAND1_ALPHA)

(defn *-gl-operand-2-alpha
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_OPERAND2_ALPHA)

(defn *-ext-blend-func-separate
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/extBlendFuncSeparate)

(defn *-open-gl-21
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/openGL21)

(defn *-shaders-supported
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/shadersSupported)

(defn *-vbo-supported
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/vboSupported)

(defn *-vbo-supported-ati
  "Static Field.

  type: boolean"
  []
  OpenGlHelper/vboSupportedAti)

(defn *-gl-array-buffer
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_ARRAY_BUFFER)

(defn *-gl-static-draw
  "Static Field.

  type: int"
  []
  OpenGlHelper/GL_STATIC_DRAW)

(defn *-last-brightness-x
  "Static Field.

  type: float"
  []
  OpenGlHelper/lastBrightnessX)

(defn *-last-brightness-y
  "Static Field.

  type: float"
  []
  OpenGlHelper/lastBrightnessY)

(defn *are-shaders-supported
  "returns: `boolean`"
  (^Boolean []
    (OpenGlHelper/areShadersSupported )))

(defn *gl-get-shaderi
  "shader-in - `int`
  pname - `int`

  returns: `int`"
  (^Integer [^Integer shader-in ^Integer pname]
    (OpenGlHelper/glGetShaderi shader-in pname)))

(defn *gl-gen-buffers
  "returns: `int`"
  (^Integer []
    (OpenGlHelper/glGenBuffers )))

(defn *gl-uniform-3
  "location - `int`
  values - `java.nio.IntBuffer`"
  ([^Integer location ^java.nio.IntBuffer values]
    (OpenGlHelper/glUniform3 location values)))

(defn *get-log-text
  "returns: `java.lang.String`"
  (^java.lang.String []
    (OpenGlHelper/getLogText )))

(defn *set-active-texture
  "texture - `int`"
  ([^Integer texture]
    (OpenGlHelper/setActiveTexture texture)))

(defn *use-vbo
  "returns: `boolean`"
  (^Boolean []
    (OpenGlHelper/useVbo )))

(defn *gl-create-program
  "returns: `int`"
  (^Integer []
    (OpenGlHelper/glCreateProgram )))

(defn *gl-delete-program
  "program - `int`"
  ([^Integer program]
    (OpenGlHelper/glDeleteProgram program)))

(defn *gl-buffer-data
  "target - `int`
  data - `java.nio.ByteBuffer`
  usage - `int`"
  ([^Integer target ^java.nio.ByteBuffer data ^Integer usage]
    (OpenGlHelper/glBufferData target data usage)))

(defn *gl-uniform-1
  "location - `int`
  values - `java.nio.IntBuffer`"
  ([^Integer location ^java.nio.IntBuffer values]
    (OpenGlHelper/glUniform1 location values)))

(defn *gl-blend-func
  "s-factor-rgb - `int`
  d-factor-rgb - `int`
  sfactor-alpha - `int`
  dfactor-alpha - `int`"
  ([^Integer s-factor-rgb ^Integer d-factor-rgb ^Integer sfactor-alpha ^Integer dfactor-alpha]
    (OpenGlHelper/glBlendFunc s-factor-rgb d-factor-rgb sfactor-alpha dfactor-alpha)))

(defn *gl-uniform-matrix-2
  "location - `int`
  transpose - `boolean`
  matrices - `java.nio.FloatBuffer`"
  ([^Integer location ^Boolean transpose ^java.nio.FloatBuffer matrices]
    (OpenGlHelper/glUniformMatrix2 location transpose matrices)))

(defn *gl-uniform-2
  "location - `int`
  values - `java.nio.IntBuffer`"
  ([^Integer location ^java.nio.IntBuffer values]
    (OpenGlHelper/glUniform2 location values)))

(defn *set-lightmap-texture-coords
  "target - `int`
  p-77475-1 - `float`
  t - `float`"
  ([^Integer target ^Float p-77475-1 ^Float t]
    (OpenGlHelper/setLightmapTextureCoords target p-77475-1 t)))

(defn *gl-delete-framebuffers
  "framebuffer-in - `int`"
  ([^Integer framebuffer-in]
    (OpenGlHelper/glDeleteFramebuffers framebuffer-in)))

(defn *framebuffer-enabled?
  "returns: `boolean`"
  (^Boolean []
    (OpenGlHelper/isFramebufferEnabled )))

(defn *gl-delete-buffers
  "buffer - `int`"
  ([^Integer buffer]
    (OpenGlHelper/glDeleteBuffers buffer)))

(defn *get-cpu
  "returns: `java.lang.String`"
  (^java.lang.String []
    (OpenGlHelper/getCpu )))

(defn *gl-compile-shader
  "shader-in - `int`"
  ([^Integer shader-in]
    (OpenGlHelper/glCompileShader shader-in)))

(defn *gl-renderbuffer-storage
  "target - `int`
  internal-format - `int`
  width - `int`
  height - `int`"
  ([^Integer target ^Integer internal-format ^Integer width ^Integer height]
    (OpenGlHelper/glRenderbufferStorage target internal-format width height)))

(defn *gl-link-program
  "program - `int`"
  ([^Integer program]
    (OpenGlHelper/glLinkProgram program)))

(defn *gl-gen-framebuffers
  "returns: `int`"
  (^Integer []
    (OpenGlHelper/glGenFramebuffers )))

(defn *initialize-textures
  ""
  ([]
    (OpenGlHelper/initializeTextures )))

(defn *gl-get-programi
  "program - `int`
  pname - `int`

  returns: `int`"
  (^Integer [^Integer program ^Integer pname]
    (OpenGlHelper/glGetProgrami program pname)))

(defn *gl-uniform-matrix-3
  "location - `int`
  transpose - `boolean`
  matrices - `java.nio.FloatBuffer`"
  ([^Integer location ^Boolean transpose ^java.nio.FloatBuffer matrices]
    (OpenGlHelper/glUniformMatrix3 location transpose matrices)))

(defn *gl-get-program-info-log
  "program - `int`
  max-length - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer program ^Integer max-length]
    (OpenGlHelper/glGetProgramInfoLog program max-length)))

(defn *gl-gen-renderbuffers
  "returns: `int`"
  (^Integer []
    (OpenGlHelper/glGenRenderbuffers )))

(defn *gl-bind-framebuffer
  "target - `int`
  framebuffer-in - `int`"
  ([^Integer target ^Integer framebuffer-in]
    (OpenGlHelper/glBindFramebuffer target framebuffer-in)))

(defn *gl-uniform-4
  "location - `int`
  values - `java.nio.IntBuffer`"
  ([^Integer location ^java.nio.IntBuffer values]
    (OpenGlHelper/glUniform4 location values)))

(defn *gl-use-program
  "program - `int`"
  ([^Integer program]
    (OpenGlHelper/glUseProgram program)))

(defn *gl-framebuffer-texture-2-d
  "target - `int`
  attachment - `int`
  textarget - `int`
  texture - `int`
  level - `int`"
  ([^Integer target ^Integer attachment ^Integer textarget ^Integer texture ^Integer level]
    (OpenGlHelper/glFramebufferTexture2D target attachment textarget texture level)))

(defn *gl-framebuffer-renderbuffer
  "target - `int`
  attachment - `int`
  render-buffer-target - `int`
  render-buffer - `int`"
  ([^Integer target ^Integer attachment ^Integer render-buffer-target ^Integer render-buffer]
    (OpenGlHelper/glFramebufferRenderbuffer target attachment render-buffer-target render-buffer)))

(defn *gl-shader-source
  "shader-in - `int`
  string - `java.nio.ByteBuffer`"
  ([^Integer shader-in ^java.nio.ByteBuffer string]
    (OpenGlHelper/glShaderSource shader-in string)))

(defn *gl-attach-shader
  "program - `int`
  shader-in - `int`"
  ([^Integer program ^Integer shader-in]
    (OpenGlHelper/glAttachShader program shader-in)))

(defn *gl-uniform-matrix-4
  "location - `int`
  transpose - `boolean`
  matrices - `java.nio.FloatBuffer`"
  ([^Integer location ^Boolean transpose ^java.nio.FloatBuffer matrices]
    (OpenGlHelper/glUniformMatrix4 location transpose matrices)))

(defn *set-client-active-texture
  "texture - `int`"
  ([^Integer texture]
    (OpenGlHelper/setClientActiveTexture texture)))

(defn *gl-bind-buffer
  "target - `int`
  buffer - `int`"
  ([^Integer target ^Integer buffer]
    (OpenGlHelper/glBindBuffer target buffer)))

(defn *gl-get-shader-info-log
  "shader-in - `int`
  max-length - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer shader-in ^Integer max-length]
    (OpenGlHelper/glGetShaderInfoLog shader-in max-length)))

(defn *render-directions
  "p-188785-0 - `int`"
  ([^Integer p-188785-0]
    (OpenGlHelper/renderDirections p-188785-0)))

(defn *gl-delete-renderbuffers
  "renderbuffer - `int`"
  ([^Integer renderbuffer]
    (OpenGlHelper/glDeleteRenderbuffers renderbuffer)))

(defn *gl-get-uniform-location
  "program-obj - `int`
  name - `java.lang.CharSequence`

  returns: `int`"
  (^Integer [^Integer program-obj ^java.lang.CharSequence name]
    (OpenGlHelper/glGetUniformLocation program-obj name)))

(defn *gl-check-framebuffer-status
  "target - `int`

  returns: `int`"
  (^Integer [^Integer target]
    (OpenGlHelper/glCheckFramebufferStatus target)))

(defn *gl-get-attrib-location
  "program - `int`
  name - `java.lang.CharSequence`

  returns: `int`"
  (^Integer [^Integer program ^java.lang.CharSequence name]
    (OpenGlHelper/glGetAttribLocation program name)))

(defn *gl-delete-shader
  "shader-in - `int`"
  ([^Integer shader-in]
    (OpenGlHelper/glDeleteShader shader-in)))

(defn *gl-bind-renderbuffer
  "target - `int`
  renderbuffer - `int`"
  ([^Integer target ^Integer renderbuffer]
    (OpenGlHelper/glBindRenderbuffer target renderbuffer)))

(defn *gl-uniform-1i
  "location - `int`
  v-0 - `int`"
  ([^Integer location ^Integer v-0]
    (OpenGlHelper/glUniform1i location v-0)))

(defn *gl-create-shader
  "type - `int`

  returns: `int`"
  (^Integer [^Integer type]
    (OpenGlHelper/glCreateShader type)))

(defn *open-file
  "file-in - `java.io.File`"
  ([^java.io.File file-in]
    (OpenGlHelper/openFile file-in)))

