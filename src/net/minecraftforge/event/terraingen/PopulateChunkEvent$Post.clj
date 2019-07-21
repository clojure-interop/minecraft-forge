(ns net.minecraftforge.event.terraingen.PopulateChunkEvent$Post
  "PopulateChunkEvent.Post is fired just after a chunk is populated with a terrain feature.
  This event is fired just after terrain feature generation in
  ChunkProviderEnd.populate(int, int),
  ChunkProviderOverworld.populate(int, int),
  and ChunkProviderHell.populate(int, int).

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen PopulateChunkEvent$Post]))

(defn ->post
  "Constructor.

  chunk-provider - `net.minecraft.world.chunk.IChunkGenerator`
  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`
  has-village-generated - `boolean`"
  (^PopulateChunkEvent$Post [^net.minecraft.world.chunk.IChunkGenerator chunk-provider ^net.minecraft.world.World world ^java.util.Random rand ^Integer chunk-x ^Integer chunk-z ^Boolean has-village-generated]
    (new PopulateChunkEvent$Post chunk-provider world rand chunk-x chunk-z has-village-generated)))

