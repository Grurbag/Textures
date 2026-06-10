// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNecrarchVampireBody extends ModelBase {
	private final ModelRenderer bipedBody;
	private final ModelRenderer cape;
	private final ModelRenderer cape2;
	private final ModelRenderer cape3;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;

	public WFMModelNecrarchVampireBody() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 0.0F, -1.5F, 8, 12, 4, 0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.0F, 3.0F);
		bipedBody.addChild(cape);
		setRotationAngle(cape, 0.2618F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 28, 0, -8.5F, -1.0F, 0.0F, 17, 25, 0, 0.0F, false));

		cape2 = new ModelRenderer(this);
		cape2.setRotationPoint(8.5F, 0.0F, 0.0F);
		cape.addChild(cape2);
		setRotationAngle(cape2, 0.0F, 1.2654F, 0.0F);
		cape2.cubeList.add(new ModelBox(cape2, 0, 39, 0.0F, -1.0F, 0.0F, 17, 25, 0, 0.0F, false));

		cape3 = new ModelRenderer(this);
		cape3.setRotationPoint(-8.5F, 0.0F, 0.0F);
		cape.addChild(cape3);
		setRotationAngle(cape3, 0.0F, -1.2217F, 0.0F);
		cape3.cubeList.add(new ModelBox(cape3, 30, 39, -17.0F, -1.0F, 0.0F, 17, 25, 0, 0.0F, false));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 0, 16, -3.0F, -2.0F, -1.5F, 4, 12, 4, 0.5F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 16, -1.0F, -2.0F, -1.5F, 4, 12, 4, 0.5F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedBody.render(f5);
		bipedRightArm.render(f5);
		bipedLeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}