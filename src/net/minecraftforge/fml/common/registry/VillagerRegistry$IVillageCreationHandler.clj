(ns net.minecraftforge.fml.common.registry.VillagerRegistry$IVillageCreationHandler
  "Allow access to the StructureVillagePieces array controlling new village
  creation so you can insert your own new village pieces"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry VillagerRegistry$IVillageCreationHandler]))

(defn get-village-piece-weight
  "Called when MapGenVillage is creating a new village

  random - `java.util.Random`
  i - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight [^VillagerRegistry$IVillageCreationHandler this ^java.util.Random random ^Integer i]
    (-> this (.getVillagePieceWeight random i))))

(defn get-component-class
  "The class of the root structure component to add to the village

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^VillagerRegistry$IVillageCreationHandler this]
    (-> this (.getComponentClass))))

(defn build-component
  "Build an instance of the village component StructureVillagePieces

  village-piece - `net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight`
  start-piece - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  pieces - `java.util.List`
  random - `java.util.Random`
  p-1 - `int`
  p-2 - `int`
  p-3 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-5 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$Village`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$Village [^VillagerRegistry$IVillageCreationHandler this ^net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight village-piece ^net.minecraft.world.gen.structure.StructureVillagePieces$Start start-piece ^java.util.List pieces ^java.util.Random random ^Integer p-1 ^Integer p-2 ^Integer p-3 ^net.minecraft.util.EnumFacing facing ^Integer p-5]
    (-> this (.buildComponent village-piece start-piece pieces random p-1 p-2 p-3 facing p-5))))

