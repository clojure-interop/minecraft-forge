(ns net.minecraft.client.renderer.GlStateManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager]))

(defn ->gl-state-manager
  "Constructor."
  (^GlStateManager []
    (new GlStateManager )))

(defn *push-attrib
  ""
  ([]
    (GlStateManager/pushAttrib )))

(defn *enable-blend
  ""
  ([]
    (GlStateManager/enableBlend )))

(defn *gl-vertex-pointer
  "size - `int`
  type - `int`
  stride - `int`
  buffer-offset - `int`"
  ([^Integer size ^Integer type ^Integer stride ^Integer buffer-offset]
    (GlStateManager/glVertexPointer size type stride buffer-offset)))

(defn *gl-get-tex-image
  "target - `int`
  level - `int`
  format - `int`
  type - `int`
  pixels - `java.nio.IntBuffer`"
  ([^Integer target ^Integer level ^Integer format ^Integer type ^java.nio.IntBuffer pixels]
    (GlStateManager/glGetTexImage target level format type pixels)))

(defn *disable-fog
  ""
  ([]
    (GlStateManager/disableFog )))

(defn *disable-color-material
  ""
  ([]
    (GlStateManager/disableColorMaterial )))

(defn *blend-func
  "src-factor - `net.minecraft.client.renderer.GlStateManager$SourceFactor`
  dst-factor - `net.minecraft.client.renderer.GlStateManager$DestFactor`"
  ([^net.minecraft.client.renderer.GlStateManager$SourceFactor src-factor ^net.minecraft.client.renderer.GlStateManager$DestFactor dst-factor]
    (GlStateManager/blendFunc src-factor dst-factor)))

(defn *enable-lighting
  ""
  ([]
    (GlStateManager/enableLighting )))

(defn *tex-gen
  "tex-gen - `net.minecraft.client.renderer.GlStateManager$TexGen`
  pname - `int`
  params - `java.nio.FloatBuffer`"
  ([^net.minecraft.client.renderer.GlStateManager$TexGen tex-gen ^Integer pname ^java.nio.FloatBuffer params]
    (GlStateManager/texGen tex-gen pname params))
  ([^net.minecraft.client.renderer.GlStateManager$TexGen tex-gen ^Integer param]
    (GlStateManager/texGen tex-gen param)))

(defn *gl-tex-parameterf
  "target - `int`
  parameter-name - `int`
  parameter - `float`"
  ([^Integer target ^Integer parameter-name ^Float parameter]
    (GlStateManager/glTexParameterf target parameter-name parameter)))

(defn *call-list
  "list - `int`"
  ([^Integer list]
    (GlStateManager/callList list)))

(defn *gl-tex-env
  "target - `int`
  parameter-name - `int`
  parameters - `java.nio.FloatBuffer`"
  ([^Integer target ^Integer parameter-name ^java.nio.FloatBuffer parameters]
    (GlStateManager/glTexEnv target parameter-name parameters)))

(defn *enable-cull
  ""
  ([]
    (GlStateManager/enableCull )))

(defn *gl-fog
  "pname - `int`
  param - `java.nio.FloatBuffer`"
  ([^Integer pname ^java.nio.FloatBuffer param]
    (GlStateManager/glFog pname param)))

(defn *shade-model
  "mode - `int`"
  ([^Integer mode]
    (GlStateManager/shadeModel mode)))

(defn *gl-get-tex-level-parameteri
  "target - `int`
  level - `int`
  parameter-name - `int`

  returns: `int`"
  (^Integer [^Integer target ^Integer level ^Integer parameter-name]
    (GlStateManager/glGetTexLevelParameteri target level parameter-name)))

(defn *do-polygon-offset
  "factor - `float`
  units - `float`"
  ([^Float factor ^Float units]
    (GlStateManager/doPolygonOffset factor units)))

(defn *clear-color
  "red - `float`
  green - `float`
  blue - `float`
  alpha - `float`"
  ([^Float red ^Float green ^Float blue ^Float alpha]
    (GlStateManager/clearColor red green blue alpha)))

(defn *enable-fog
  ""
  ([]
    (GlStateManager/enableFog )))

(defn *gl-tex-envi
  "target - `int`
  parameter-name - `int`
  parameter - `int`"
  ([^Integer target ^Integer parameter-name ^Integer parameter]
    (GlStateManager/glTexEnvi target parameter-name parameter)))

(defn *set-active-texture
  "texture - `int`"
  ([^Integer texture]
    (GlStateManager/setActiveTexture texture)))

(defn *translate
  "x - `float`
  y - `float`
  z - `float`"
  ([^Float x ^Float y ^Float z]
    (GlStateManager/translate x y z)))

(defn *gl-end-list
  ""
  ([]
    (GlStateManager/glEndList )))

(defn *viewport
  "x - `int`
  y - `int`
  width - `int`
  height - `int`"
  ([^Integer x ^Integer y ^Integer width ^Integer height]
    (GlStateManager/viewport x y width height)))

(defn *gl-tex-coord-pointer
  "size - `int`
  type - `int`
  stride - `int`
  buffer-offset - `int`"
  ([^Integer size ^Integer type ^Integer stride ^Integer buffer-offset]
    (GlStateManager/glTexCoordPointer size type stride buffer-offset)))

(defn *disable-rescale-normal
  ""
  ([]
    (GlStateManager/disableRescaleNormal )))

(defn *depth-mask
  "flag-in - `boolean`"
  ([^Boolean flag-in]
    (GlStateManager/depthMask flag-in)))

(defn *scale
  "x - `float`
  y - `float`
  z - `float`"
  ([^Float x ^Float y ^Float z]
    (GlStateManager/scale x y z)))

(defn *gl-get-error
  "returns: `int`"
  (^Integer []
    (GlStateManager/glGetError )))

(defn *depth-func
  "depth-func - `int`"
  ([^Integer depth-func]
    (GlStateManager/depthFunc depth-func)))

(defn *enable-alpha
  ""
  ([]
    (GlStateManager/enableAlpha )))

(defn *enable-outline-mode
  "p-187431-0 - `int`"
  ([^Integer p-187431-0]
    (GlStateManager/enableOutlineMode p-187431-0)))

(defn *disable-depth
  ""
  ([]
    (GlStateManager/disableDepth )))

(defn *color-material
  "face - `int`
  mode - `int`"
  ([^Integer face ^Integer mode]
    (GlStateManager/colorMaterial face mode)))

(defn *disable-blend
  ""
  ([]
    (GlStateManager/disableBlend )))

(defn *gl-normal-pointer
  "type - `int`
  stride - `int`
  buffer - `java.nio.ByteBuffer`"
  ([^Integer type ^Integer stride ^java.nio.ByteBuffer buffer]
    (GlStateManager/glNormalPointer type stride buffer)))

(defn *quat-to-gl-matrix
  "buffer - `java.nio.FloatBuffer`
  quaternion-in - `org.lwjgl.util.vector.Quaternion`

  returns: `java.nio.FloatBuffer`"
  (^java.nio.FloatBuffer [^java.nio.FloatBuffer buffer ^org.lwjgl.util.vector.Quaternion quaternion-in]
    (GlStateManager/quatToGlMatrix buffer quaternion-in)))

(defn *gl-blend-equation
  "blend-equation - `int`"
  ([^Integer blend-equation]
    (GlStateManager/glBlendEquation blend-equation)))

(defn *try-blend-func-separate
  "src-factor - `net.minecraft.client.renderer.GlStateManager$SourceFactor`
  dst-factor - `net.minecraft.client.renderer.GlStateManager$DestFactor`
  src-factor-alpha - `net.minecraft.client.renderer.GlStateManager$SourceFactor`
  dst-factor-alpha - `net.minecraft.client.renderer.GlStateManager$DestFactor`"
  ([^net.minecraft.client.renderer.GlStateManager$SourceFactor src-factor ^net.minecraft.client.renderer.GlStateManager$DestFactor dst-factor ^net.minecraft.client.renderer.GlStateManager$SourceFactor src-factor-alpha ^net.minecraft.client.renderer.GlStateManager$DestFactor dst-factor-alpha]
    (GlStateManager/tryBlendFuncSeparate src-factor dst-factor src-factor-alpha dst-factor-alpha)))

(defn *set-fog-start
  "param - `float`"
  ([^Float param]
    (GlStateManager/setFogStart param)))

(defn *enable-color-logic
  ""
  ([]
    (GlStateManager/enableColorLogic )))

(defn *enable-color-material
  ""
  ([]
    (GlStateManager/enableColorMaterial )))

(defn *gl-copy-tex-sub-image-2-d
  "target - `int`
  level - `int`
  x-offset - `int`
  y-offset - `int`
  x - `int`
  y - `int`
  width - `int`
  height - `int`"
  ([^Integer target ^Integer level ^Integer x-offset ^Integer y-offset ^Integer x ^Integer y ^Integer width ^Integer height]
    (GlStateManager/glCopyTexSubImage2D target level x-offset y-offset x y width height)))

(defn *enable-normalize
  ""
  ([]
    (GlStateManager/enableNormalize )))

(defn *color-mask
  "red - `boolean`
  green - `boolean`
  blue - `boolean`
  alpha - `boolean`"
  ([^Boolean red ^Boolean green ^Boolean blue ^Boolean alpha]
    (GlStateManager/colorMask red green blue alpha)))

(defn *gl-get-integer
  "parameter-name - `int`
  parameters - `java.nio.IntBuffer`"
  ([^Integer parameter-name ^java.nio.IntBuffer parameters]
    (GlStateManager/glGetInteger parameter-name parameters))
  (^Integer [^Integer parameter-name]
    (GlStateManager/glGetInteger parameter-name)))

(defn *enable-light
  "light - `int`"
  ([^Integer light]
    (GlStateManager/enableLight light)))

(defn *disable-light
  "light - `int`"
  ([^Integer light]
    (GlStateManager/disableLight light)))

(defn *gl-polygon-mode
  "face - `int`
  mode - `int`"
  ([^Integer face ^Integer mode]
    (GlStateManager/glPolygonMode face mode)))

(defn *gl-tex-sub-image-2-d
  "target - `int`
  level - `int`
  x-offset - `int`
  y-offset - `int`
  width - `int`
  height - `int`
  format - `int`
  type - `int`
  pixels - `java.nio.IntBuffer`"
  ([^Integer target ^Integer level ^Integer x-offset ^Integer y-offset ^Integer width ^Integer height ^Integer format ^Integer type ^java.nio.IntBuffer pixels]
    (GlStateManager/glTexSubImage2D target level x-offset y-offset width height format type pixels)))

(defn *gl-gen-lists
  "range - `int`

  returns: `int`"
  (^Integer [^Integer range]
    (GlStateManager/glGenLists range)))

(defn *disable-outline-mode
  ""
  ([]
    (GlStateManager/disableOutlineMode )))

(defn *gl-get-string
  "name - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer name]
    (GlStateManager/glGetString name)))

(defn *gl-draw-arrays
  "mode - `int`
  first - `int`
  count - `int`"
  ([^Integer mode ^Integer first ^Integer count]
    (GlStateManager/glDrawArrays mode first count)))

(defn *gl-tex-image-2-d
  "target - `int`
  level - `int`
  internal-format - `int`
  width - `int`
  height - `int`
  border - `int`
  format - `int`
  type - `int`
  pixels - `java.nio.IntBuffer`"
  ([^Integer target ^Integer level ^Integer internal-format ^Integer width ^Integer height ^Integer border ^Integer format ^Integer type ^java.nio.IntBuffer pixels]
    (GlStateManager/glTexImage2D target level internal-format width height border format type pixels)))

(defn *enable-rescale-normal
  ""
  ([]
    (GlStateManager/enableRescaleNormal )))

(defn *gl-line-width
  "width - `float`"
  ([^Float width]
    (GlStateManager/glLineWidth width)))

(defn *gl-disable-client-state
  "cap - `int`"
  ([^Integer cap]
    (GlStateManager/glDisableClientState cap)))

(defn *load-identity
  ""
  ([]
    (GlStateManager/loadIdentity )))

(defn *gl-tex-parameteri
  "target - `int`
  parameter-name - `int`
  parameter - `int`"
  ([^Integer target ^Integer parameter-name ^Integer parameter]
    (GlStateManager/glTexParameteri target parameter-name parameter)))

(defn *gl-read-pixels
  "x - `int`
  y - `int`
  width - `int`
  height - `int`
  format - `int`
  type - `int`
  pixels - `java.nio.IntBuffer`"
  ([^Integer x ^Integer y ^Integer width ^Integer height ^Integer format ^Integer type ^java.nio.IntBuffer pixels]
    (GlStateManager/glReadPixels x y width height format type pixels)))

(defn *enable-polygon-offset
  ""
  ([]
    (GlStateManager/enablePolygonOffset )))

(defn *enable-tex-gen-coord
  "tex-gen - `net.minecraft.client.renderer.GlStateManager$TexGen`"
  ([^net.minecraft.client.renderer.GlStateManager$TexGen tex-gen]
    (GlStateManager/enableTexGenCoord tex-gen)))

(defn *enable-depth
  ""
  ([]
    (GlStateManager/enableDepth )))

(defn *disable-alpha
  ""
  ([]
    (GlStateManager/disableAlpha )))

(defn *enable-blend-profile
  "p-187408-0 - `net.minecraft.client.renderer.GlStateManager$Profile`"
  ([^net.minecraft.client.renderer.GlStateManager$Profile p-187408-0]
    (GlStateManager/enableBlendProfile p-187408-0)))

(defn *gl-light
  "light - `int`
  pname - `int`
  params - `java.nio.FloatBuffer`"
  ([^Integer light ^Integer pname ^java.nio.FloatBuffer params]
    (GlStateManager/glLight light pname params)))

(defn *ortho
  "left - `double`
  right - `double`
  bottom - `double`
  top - `double`
  z-near - `double`
  z-far - `double`"
  ([^Double left ^Double right ^Double bottom ^Double top ^Double z-near ^Double z-far]
    (GlStateManager/ortho left right bottom top z-near z-far)))

(defn *disable-polygon-offset
  ""
  ([]
    (GlStateManager/disablePolygonOffset )))

(defn *push-matrix
  ""
  ([]
    (GlStateManager/pushMatrix )))

(defn *gl-fogi
  "pname - `int`
  param - `int`"
  ([^Integer pname ^Integer param]
    (GlStateManager/glFogi pname param)))

(defn *disable-tex-gen-coord
  "tex-gen - `net.minecraft.client.renderer.GlStateManager$TexGen`"
  ([^net.minecraft.client.renderer.GlStateManager$TexGen tex-gen]
    (GlStateManager/disableTexGenCoord tex-gen)))

(defn *clear-depth
  "depth - `double`"
  ([^Double depth]
    (GlStateManager/clearDepth depth)))

(defn *pop-matrix
  ""
  ([]
    (GlStateManager/popMatrix )))

(defn *alpha-func
  "func - `int`
  ref - `float`"
  ([^Integer func ^Float ref]
    (GlStateManager/alphaFunc func ref)))

(defn *enable-texture-2-d
  ""
  ([]
    (GlStateManager/enableTexture2D )))

(defn *mult-matrix
  "matrix - `java.nio.FloatBuffer`"
  ([^java.nio.FloatBuffer matrix]
    (GlStateManager/multMatrix matrix)))

(defn *gl-delete-lists
  "list - `int`
  range - `int`"
  ([^Integer list ^Integer range]
    (GlStateManager/glDeleteLists list range)))

(defn *reset-color
  ""
  ([]
    (GlStateManager/resetColor )))

(defn *delete-texture
  "texture - `int`"
  ([^Integer texture]
    (GlStateManager/deleteTexture texture)))

(defn *gl-new-list
  "list - `int`
  mode - `int`"
  ([^Integer list ^Integer mode]
    (GlStateManager/glNewList list mode)))

(defn *set-fog
  "fog-mode - `net.minecraft.client.renderer.GlStateManager$FogMode`"
  ([^net.minecraft.client.renderer.GlStateManager$FogMode fog-mode]
    (GlStateManager/setFog fog-mode)))

(defn *matrix-mode
  "mode - `int`"
  ([^Integer mode]
    (GlStateManager/matrixMode mode)))

(defn *gl-light-model
  "pname - `int`
  params - `java.nio.FloatBuffer`"
  ([^Integer pname ^java.nio.FloatBuffer params]
    (GlStateManager/glLightModel pname params)))

(defn *cull-face
  "cull-face - `net.minecraft.client.renderer.GlStateManager$CullFace`"
  ([^net.minecraft.client.renderer.GlStateManager$CullFace cull-face]
    (GlStateManager/cullFace cull-face)))

(defn *disable-lighting
  ""
  ([]
    (GlStateManager/disableLighting )))

(defn *bind-texture
  "texture - `int`"
  ([^Integer texture]
    (GlStateManager/bindTexture texture)))

(defn *disable-cull
  ""
  ([]
    (GlStateManager/disableCull )))

(defn *generate-texture
  "returns: `int`"
  (^Integer []
    (GlStateManager/generateTexture )))

(defn *gl-pixel-storei
  "parameter-name - `int`
  param - `int`"
  ([^Integer parameter-name ^Integer param]
    (GlStateManager/glPixelStorei parameter-name param)))

(defn *disable-color-logic
  ""
  ([]
    (GlStateManager/disableColorLogic )))

(defn *set-fog-end
  "param - `float`"
  ([^Float param]
    (GlStateManager/setFogEnd param)))

(defn *clear
  "mask - `int`"
  ([^Integer mask]
    (GlStateManager/clear mask)))

(defn *gl-begin
  "mode - `int`"
  ([^Integer mode]
    (GlStateManager/glBegin mode)))

(defn *set-fog-density
  "param - `float`"
  ([^Float param]
    (GlStateManager/setFogDensity param)))

(defn *color-logic-op
  "logic-operation - `net.minecraft.client.renderer.GlStateManager$LogicOp`"
  ([^net.minecraft.client.renderer.GlStateManager$LogicOp logic-operation]
    (GlStateManager/colorLogicOp logic-operation)))

(defn *gl-enable-client-state
  "cap - `int`"
  ([^Integer cap]
    (GlStateManager/glEnableClientState cap)))

(defn *get-float
  "pname - `int`
  params - `java.nio.FloatBuffer`"
  ([^Integer pname ^java.nio.FloatBuffer params]
    (GlStateManager/getFloat pname params)))

(defn *gl-vertex-3f
  "x - `float`
  y - `float`
  z - `float`"
  ([^Float x ^Float y ^Float z]
    (GlStateManager/glVertex3f x y z)))

(defn *pop-attrib
  ""
  ([]
    (GlStateManager/popAttrib )))

(defn *rotate
  "angle - `float`
  x - `float`
  y - `float`
  z - `float`"
  ([^Float angle ^Float x ^Float y ^Float z]
    (GlStateManager/rotate angle x y z))
  ([^org.lwjgl.util.vector.Quaternion quaternion-in]
    (GlStateManager/rotate quaternion-in)))

(defn *color
  "color-red - `float`
  color-green - `float`
  color-blue - `float`
  color-alpha - `float`"
  ([^Float color-red ^Float color-green ^Float color-blue ^Float color-alpha]
    (GlStateManager/color color-red color-green color-blue color-alpha))
  ([^Float color-red ^Float color-green ^Float color-blue]
    (GlStateManager/color color-red color-green color-blue)))

(defn *gl-end
  ""
  ([]
    (GlStateManager/glEnd )))

(defn *gl-color-pointer
  "size - `int`
  type - `int`
  stride - `int`
  buffer-offset - `int`"
  ([^Integer size ^Integer type ^Integer stride ^Integer buffer-offset]
    (GlStateManager/glColorPointer size type stride buffer-offset)))

(defn *disable-blend-profile
  "p-187440-0 - `net.minecraft.client.renderer.GlStateManager$Profile`"
  ([^net.minecraft.client.renderer.GlStateManager$Profile p-187440-0]
    (GlStateManager/disableBlendProfile p-187440-0)))

(defn *gl-tex-coord-2f
  "s-coord - `float`
  t-coord - `float`"
  ([^Float s-coord ^Float t-coord]
    (GlStateManager/glTexCoord2f s-coord t-coord)))

(defn *disable-normalize
  ""
  ([]
    (GlStateManager/disableNormalize )))

(defn *disable-texture-2-d
  ""
  ([]
    (GlStateManager/disableTexture2D )))

(defn *gl-normal-3f
  "nx - `float`
  ny - `float`
  nz - `float`"
  ([^Float nx ^Float ny ^Float nz]
    (GlStateManager/glNormal3f nx ny nz)))

(defn *gl-tex-envf
  "target - `int`
  parameter-name - `int`
  parameter - `float`"
  ([^Integer target ^Integer parameter-name ^Float parameter]
    (GlStateManager/glTexEnvf target parameter-name parameter)))

