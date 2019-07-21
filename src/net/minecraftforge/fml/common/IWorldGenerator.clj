(ns net.minecraftforge.fml.common.IWorldGenerator
  "This is called back during world generation."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common IWorldGenerator]))

(defn generate
  "Generate some world

  random - the chunk specific Random. - `java.util.Random`
  chunk-x - the chunk X coordinate of this chunk. - `int`
  chunk-z - the chunk Z coordinate of this chunk. - `int`
  world - : additionalData[0] The minecraft World we're generating for. - `net.minecraft.world.World`
  chunk-generator - : additionalData[1] The IChunkProvider that is generating. - `net.minecraft.world.chunk.IChunkGenerator`
  chunk-provider - : additionalData[2] IChunkProvider that is requesting the world generation. - `net.minecraft.world.chunk.IChunkProvider`"
  ([^IWorldGenerator this ^java.util.Random random ^Integer chunk-x ^Integer chunk-z ^net.minecraft.world.World world ^net.minecraft.world.chunk.IChunkGenerator chunk-generator ^net.minecraft.world.chunk.IChunkProvider chunk-provider]
    (-> this (.generate random chunk-x chunk-z world chunk-generator chunk-provider))))

