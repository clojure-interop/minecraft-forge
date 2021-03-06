(ns net.minecraft.client.resources.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraft.client.resources.AbstractResourcePack])
(require '[net.minecraft.client.resources.DefaultPlayerSkin])
(require '[net.minecraft.client.resources.DefaultResourcePack])
(require '[net.minecraft.client.resources.FallbackResourceManager])
(require '[net.minecraft.client.resources.FileResourcePack])
(require '[net.minecraft.client.resources.FolderResourcePack])
(require '[net.minecraft.client.resources.FoliageColorReloadListener])
(require '[net.minecraft.client.resources.GrassColorReloadListener])
(require '[net.minecraft.client.resources.I18n])
(require '[net.minecraft.client.resources.IReloadableResourceManager])
(require '[net.minecraft.client.resources.IResource])
(require '[net.minecraft.client.resources.IResourceManager])
(require '[net.minecraft.client.resources.IResourceManagerReloadListener])
(require '[net.minecraft.client.resources.IResourcePack])
(require '[net.minecraft.client.resources.Language])
(require '[net.minecraft.client.resources.LanguageManager])
(require '[net.minecraft.client.resources.LegacyV2Adapter])
(require '[net.minecraft.client.resources.Locale])
(require '[net.minecraft.client.resources.ResourceIndex])
(require '[net.minecraft.client.resources.ResourceIndexFolder])
(require '[net.minecraft.client.resources.ResourcePackFileNotFoundException])
(require '[net.minecraft.client.resources.ResourcePackListEntry])
(require '[net.minecraft.client.resources.ResourcePackListEntryDefault])
(require '[net.minecraft.client.resources.ResourcePackListEntryFound])
(require '[net.minecraft.client.resources.ResourcePackListEntryServer])
(require '[net.minecraft.client.resources.ResourcePackRepository])
(require '[net.minecraft.client.resources.SimpleReloadableResourceManager])
(require '[net.minecraft.client.resources.SimpleResource])
(require '[net.minecraft.client.resources.SkinManager$SkinAvailableCallback])
(require '[net.minecraft.client.resources.SkinManager])
