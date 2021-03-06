(ns net.minecraft.client.gui.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraft.client.gui.ChatLine])
(require '[net.minecraft.client.gui.FontRenderer])
(require '[net.minecraft.client.gui.Gui])
(require '[net.minecraft.client.gui.GuiBossOverlay])
(require '[net.minecraft.client.gui.GuiButton])
(require '[net.minecraft.client.gui.GuiButtonLanguage])
(require '[net.minecraft.client.gui.GuiButtonRealmsProxy])
(require '[net.minecraft.client.gui.GuiChat$ChatTabCompleter])
(require '[net.minecraft.client.gui.GuiChat])
(require '[net.minecraft.client.gui.GuiClickableScrolledSelectionListProxy])
(require '[net.minecraft.client.gui.GuiCommandBlock])
(require '[net.minecraft.client.gui.GuiConfirmOpenLink])
(require '[net.minecraft.client.gui.GuiControls])
(require '[net.minecraft.client.gui.GuiCreateFlatWorld])
(require '[net.minecraft.client.gui.GuiCreateWorld])
(require '[net.minecraft.client.gui.GuiCustomizeSkin])
(require '[net.minecraft.client.gui.GuiCustomizeWorldScreen])
(require '[net.minecraft.client.gui.GuiDisconnected])
(require '[net.minecraft.client.gui.GuiDownloadTerrain])
(require '[net.minecraft.client.gui.GuiEnchantment])
(require '[net.minecraft.client.gui.GuiErrorScreen])
(require '[net.minecraft.client.gui.GuiFlatPresets])
(require '[net.minecraft.client.gui.GuiGameOver])
(require '[net.minecraft.client.gui.GuiHopper])
(require '[net.minecraft.client.gui.GuiIngame])
(require '[net.minecraft.client.gui.GuiIngameMenu])
(require '[net.minecraft.client.gui.GuiKeyBindingList])
(require '[net.minecraft.client.gui.GuiLabel])
(require '[net.minecraft.client.gui.GuiLanguage])
(require '[net.minecraft.client.gui.GuiListButton])
(require '[net.minecraft.client.gui.GuiListExtended$IGuiListEntry])
(require '[net.minecraft.client.gui.GuiListExtended])
(require '[net.minecraft.client.gui.GuiListWorldSelection])
(require '[net.minecraft.client.gui.GuiListWorldSelectionEntry])
(require '[net.minecraft.client.gui.GuiLockIconButton])
(require '[net.minecraft.client.gui.GuiMainMenu])
(require '[net.minecraft.client.gui.GuiMemoryErrorScreen])
(require '[net.minecraft.client.gui.GuiMerchant])
(require '[net.minecraft.client.gui.GuiMultiplayer])
(require '[net.minecraft.client.gui.GuiNewChat])
(require '[net.minecraft.client.gui.GuiOptionButton])
(require '[net.minecraft.client.gui.GuiOptionSlider])
(require '[net.minecraft.client.gui.GuiOptions])
(require '[net.minecraft.client.gui.GuiOptionsRowList$Row])
(require '[net.minecraft.client.gui.GuiOptionsRowList])
(require '[net.minecraft.client.gui.GuiOverlayDebug])
(require '[net.minecraft.client.gui.GuiPageButtonList$EditBoxEntry])
(require '[net.minecraft.client.gui.GuiPageButtonList$GuiButtonEntry])
(require '[net.minecraft.client.gui.GuiPageButtonList$GuiEntry])
(require '[net.minecraft.client.gui.GuiPageButtonList$GuiLabelEntry])
(require '[net.minecraft.client.gui.GuiPageButtonList$GuiListEntry])
(require '[net.minecraft.client.gui.GuiPageButtonList$GuiResponder])
(require '[net.minecraft.client.gui.GuiPageButtonList$GuiSlideEntry])
(require '[net.minecraft.client.gui.GuiPageButtonList])
(require '[net.minecraft.client.gui.GuiPlayerTabOverlay])
(require '[net.minecraft.client.gui.GuiRepair])
(require '[net.minecraft.client.gui.GuiResourcePackAvailable])
(require '[net.minecraft.client.gui.GuiResourcePackList])
(require '[net.minecraft.client.gui.GuiResourcePackSelected])
(require '[net.minecraft.client.gui.GuiScreen])
(require '[net.minecraft.client.gui.GuiScreenAddServer])
(require '[net.minecraft.client.gui.GuiScreenBook])
(require '[net.minecraft.client.gui.GuiScreenCustomizePresets])
(require '[net.minecraft.client.gui.GuiScreenDemo])
(require '[net.minecraft.client.gui.GuiScreenOptionsSounds])
(require '[net.minecraft.client.gui.GuiScreenRealmsProxy])
(require '[net.minecraft.client.gui.GuiScreenResourcePacks])
(require '[net.minecraft.client.gui.GuiScreenServerList])
(require '[net.minecraft.client.gui.GuiScreenWorking])
(require '[net.minecraft.client.gui.GuiShareToLan])
(require '[net.minecraft.client.gui.GuiSimpleScrolledSelectionListProxy])
(require '[net.minecraft.client.gui.GuiSleepMP])
(require '[net.minecraft.client.gui.GuiSlider$FormatHelper])
(require '[net.minecraft.client.gui.GuiSlider])
(require '[net.minecraft.client.gui.GuiSlot])
(require '[net.minecraft.client.gui.GuiSlotRealmsProxy])
(require '[net.minecraft.client.gui.GuiSnooper])
(require '[net.minecraft.client.gui.GuiSpectator])
(require '[net.minecraft.client.gui.GuiSubtitleOverlay])
(require '[net.minecraft.client.gui.GuiTextField])
(require '[net.minecraft.client.gui.GuiUtilRenderComponents])
(require '[net.minecraft.client.gui.GuiVideoSettings])
(require '[net.minecraft.client.gui.GuiWinGame])
(require '[net.minecraft.client.gui.GuiWorldEdit])
(require '[net.minecraft.client.gui.GuiWorldSelection])
(require '[net.minecraft.client.gui.GuiYesNo])
(require '[net.minecraft.client.gui.GuiYesNoCallback])
(require '[net.minecraft.client.gui.IProgressMeter])
(require '[net.minecraft.client.gui.MapItemRenderer])
(require '[net.minecraft.client.gui.ScaledResolution])
(require '[net.minecraft.client.gui.ScreenChatOptions])
(require '[net.minecraft.client.gui.ServerListEntryLanDetected])
(require '[net.minecraft.client.gui.ServerListEntryLanScan])
(require '[net.minecraft.client.gui.ServerListEntryNormal])
(require '[net.minecraft.client.gui.ServerSelectionList])
