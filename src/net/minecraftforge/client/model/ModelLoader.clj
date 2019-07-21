(ns net.minecraftforge.client.model.ModelLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelLoader]))

(defn ->model-loader
  "Constructor.

  manager - `net.minecraft.client.resources.IResourceManager`
  map - `net.minecraft.client.renderer.texture.TextureMap`
  shapes - `net.minecraft.client.renderer.BlockModelShapes`"
  (^ModelLoader [^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.client.renderer.texture.TextureMap map ^net.minecraft.client.renderer.BlockModelShapes shapes]
    (new ModelLoader manager map shapes)))

(defn *get-inventory-variant
  "Hooked from ModelBakery, allows using MRLs that don't end with \"inventory\" for items.

  s - `java.lang.String`

  returns: `net.minecraft.client.renderer.block.model.ModelResourceLocation`"
  (^net.minecraft.client.renderer.block.model.ModelResourceLocation [^java.lang.String s]
    (ModelLoader/getInventoryVariant s)))

(defn *set-custom-state-mapper
  "Adds a custom IBlockState -> model variant logic.

  block - `net.minecraft.block.Block`
  mapper - `net.minecraft.client.renderer.block.statemap.IStateMapper`"
  ([^net.minecraft.block.Block block ^net.minecraft.client.renderer.block.statemap.IStateMapper mapper]
    (ModelLoader/setCustomStateMapper block mapper)))

(defn *on-register-all-blocks
  "Internal, do not use.

  shapes - `net.minecraft.client.renderer.BlockModelShapes`"
  ([^net.minecraft.client.renderer.BlockModelShapes shapes]
    (ModelLoader/onRegisterAllBlocks shapes)))

(defn *set-custom-model-resource-location
  "Adds a simple mapping from Item  metadata to the model variant.
   Registers the variant with the ModelBakery too.

  item - `net.minecraft.item.Item`
  metadata - `int`
  model - `net.minecraft.client.renderer.block.model.ModelResourceLocation`"
  ([^net.minecraft.item.Item item ^Integer metadata ^net.minecraft.client.renderer.block.model.ModelResourceLocation model]
    (ModelLoader/setCustomModelResourceLocation item metadata model)))

(defn *set-custom-mesh-definition
  "Adds generic ItemStack -> model variant logic.
   You still need to manually call ModelBakery.registerItemVariants with all values that meshDefinition can return.

  item - `net.minecraft.item.Item`
  mesh-definition - `net.minecraft.client.renderer.ItemMeshDefinition`"
  ([^net.minecraft.item.Item item ^net.minecraft.client.renderer.ItemMeshDefinition mesh-definition]
    (ModelLoader/setCustomMeshDefinition item mesh-definition)))

(defn *set-bucket-model-definition
  "Helper method for registering all itemstacks for given item to map to universal bucket model.

  item - `net.minecraft.item.Item`"
  ([^net.minecraft.item.Item item]
    (ModelLoader/setBucketModelDefinition item)))

(defn *on-register-items
  "Internal, do not use.

  mesher - `net.minecraft.client.renderer.ItemModelMesher`"
  ([^net.minecraft.client.renderer.ItemModelMesher mesher]
    (ModelLoader/onRegisterItems mesher)))

(defn *default-texture-getter
  "Get the default texture getter the models will be baked with.

  returns: `com.google.common.base.Function<net.minecraft.util.ResourceLocation,net.minecraft.client.renderer.texture.TextureAtlasSprite>`"
  (^com.google.common.base.Function []
    (ModelLoader/defaultTextureGetter )))

(defn loading?
  "returns: `boolean`"
  (^Boolean [^ModelLoader this]
    (-> this (.isLoading))))

(defn setup-model-registry
  "returns: `net.minecraft.util.registry.IRegistry<net.minecraft.client.renderer.block.model.ModelResourceLocation,net.minecraft.client.renderer.block.model.IBakedModel>`"
  (^net.minecraft.util.registry.IRegistry [^ModelLoader this]
    (-> this (.setupModelRegistry))))

(defn on-post-bake-event
  "Internal, do not use.

  model-registry - `net.minecraft.util.registry.IRegistry`"
  ([^ModelLoader this ^net.minecraft.util.registry.IRegistry model-registry]
    (-> this (.onPostBakeEvent model-registry))))

