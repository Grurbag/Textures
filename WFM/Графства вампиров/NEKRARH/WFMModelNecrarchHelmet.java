// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNecrarchHelmet extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer cape;
	private final ModelRenderer cape2;
	private final ModelRenderer cape3;
	private final ModelRenderer cape4;
	private final ModelRenderer cape5;

	public WFMModelNecrarchHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, -7, 25, -9.5F, 0.0F, -3.0F, 19, 0, 7, 0.0F, false));

		cape2 = new ModelRenderer(this);
		cape2.setRotationPoint(0.0F, 0.0F, 4.0F);
		cape.addChild(cape2);
		setRotationAngle(cape2, 1.3963F, 0.0F, 0.0F);
		cape2.cubeList.add(new ModelBox(cape2, 18, 0, -7.5F, 0.0F, 0.0F, 15, 0, 16, 0.0F, false));

		cape3 = new ModelRenderer(this);
		cape3.setRotationPoint(7.5F, 0.0F, 0.0F);
		cape2.addChild(cape3);
		setRotationAngle(cape3, 0.0F, 0.0F, -0.8727F);
		cape3.cubeList.add(new ModelBox(cape3, 32, 16, 0.0F, 0.0F, -4.0F, 8, 0, 16, 0.0F, false));

		cape4 = new ModelRenderer(this);
		cape4.setRotationPoint(-7.5F, 0.0F, 0.0F);
		cape2.addChild(cape4);
		setRotationAngle(cape4, 0.0F, 0.0F, -2.2689F);
		cape4.cubeList.add(new ModelBox(cape4, 32, 16, 0.0F, 0.0F, -4.0F, 8, 0, 16, 0.0F, false));

		cape5 = new ModelRenderer(this);
		cape5.setRotationPoint(0.0F, 0.0F, 16.0F);
		cape2.addChild(cape5);
		cape5.cubeList.add(new ModelBox(cape5, -5, 16, -3.5F, 0.0F, 0.0F, 7, 0, 5, 0.0F, false));
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