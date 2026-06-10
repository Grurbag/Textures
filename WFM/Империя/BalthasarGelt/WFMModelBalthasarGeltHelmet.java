// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelBalthasarGeltHelmet extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedHeadwear;
	private final ModelRenderer vorotnik;
	private final ModelRenderer star;

	public WFMModelBalthasarGeltHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 20.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -4.0F, -4.0F, 8, 8, 8, 0.6F, false));

		bipedHeadwear = new ModelRenderer(this);
		bipedHeadwear.setRotationPoint(3.0F, 4.0F, -3.0F);
		bipedHead.addChild(bipedHeadwear);
		bipedHeadwear.cubeList.add(new ModelBox(bipedHeadwear, 32, 0, -7.0F, -8.0F, -1.0F, 8, 8, 8, 1.0F, false));

		vorotnik = new ModelRenderer(this);
		vorotnik.setRotationPoint(3.0F, 2.0F, 1.0F);
		bipedHead.addChild(vorotnik);
		setRotationAngle(vorotnik, -0.7418F, 0.0F, 0.0F);
		vorotnik.cubeList.add(new ModelBox(vorotnik, 0, 45, -15.5F, -12.0F, 1.0F, 25, 17, 0, 0.0F, false));

		star = new ModelRenderer(this);
		star.setRotationPoint(3.0F, -5.0F, -1.0F);
		bipedHead.addChild(star);
		star.cubeList.add(new ModelBox(star, 0, 16, -15.5F, -12.0F, 1.0F, 25, 19, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedHead.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}