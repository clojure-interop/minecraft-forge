(ns net.minecraftforge.client.MinecraftForgeClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client MinecraftForgeClient]))

(defn ->minecraft-forge-client
  "Constructor."
  (^MinecraftForgeClient []
    (new MinecraftForgeClient )))

(defn *get-render-pass
  "returns: `int`"
  (^Integer []
    (MinecraftForgeClient/getRenderPass )))

(defn *get-render-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer []
    (MinecraftForgeClient/getRenderLayer )))

(defn *get-locale
  "returns the Locale set by the player in Minecraft.
   Useful for creating string and number formatters.

  returns: `java.util.Locale`"
  (^java.util.Locale []
    (MinecraftForgeClient/getLocale )))

(defn *reserve-stencil-bit
  "Reserve a stencil bit for use in rendering

   Note: you must check the Framebuffer you are working with to
   determine if stencil bits are enabled on it before use.

  returns: A bit or -1 if no further stencil bits are available - `int`"
  (^Integer []
    (MinecraftForgeClient/reserveStencilBit )))

(defn *release-stencil-bit
  "Release the stencil bit for other use

  bit - The bit from reserveStencilBit() - `int`"
  ([^Integer bit]
    (MinecraftForgeClient/releaseStencilBit bit)))

(defn *on-rebuild-chunk
  "world - `net.minecraft.world.World`
  position - `net.minecraft.util.math.BlockPos`
  cache - `net.minecraft.world.ChunkCache`"
  ([^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos position ^net.minecraft.world.ChunkCache cache]
    (MinecraftForgeClient/onRebuildChunk world position cache)))

(defn *get-region-render-cache
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.ChunkCache`"
  (^net.minecraft.world.ChunkCache [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (MinecraftForgeClient/getRegionRenderCache world pos)))

