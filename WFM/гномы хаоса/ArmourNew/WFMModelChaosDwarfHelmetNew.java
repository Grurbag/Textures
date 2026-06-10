package lotr.client.model;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WFMModelChaosDwarfHelmet extends ModelBiped {
	private final ModelRenderer Head;

	public WFMModelChaosDwarfHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addChild(Head);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F));
		Head.cubeList.add(new ModelBox(Head, 35, 31, -3.5F, -16.0F, -3.5F, 7, 7, 7, 0.6F));
		Head.cubeList.add(new ModelBox(Head, 34, 17, -3.5F, -16.0F, -3.5F, 7, 6, 7, 1.0F));
		Head.cubeList.add(new ModelBox(Head, 20, 51, -5.5F, -19.0F, -5.5F, 11, 2, 11, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 46, -3.5F, -20.0F, -3.5F, 7, 1, 7, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -1.0F, -22.0F, -1.0F, 2, 2, 2, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 45, -1.5F, -26.0F, 0.0F, 3, 4, 0, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 32, 4.0F, -13.0F, 0.0F, 5, 4, 0, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 36, 4.0F, -17.0F, 0.0F, 5, 4, 0, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 10, 36, -9.0F, -17.0F, 0.0F, 5, 4, 0, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 10, 32, -9.0F, -13.0F, 0.0F, 5, 4, 0, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 19, -3.5F, -17.0F, 4.5F, 8, 8, 0, -0.5F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedHead.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}