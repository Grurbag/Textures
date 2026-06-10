// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelChannelBody extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer shoulderSpike_r1;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer spike_r1;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;

	public WFMModelChannelBody() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));
		Body.cubeList.add(new ModelBox(Body, 44, 59, -4.0F, 2.0F, -4.0F, 8, 3, 2, 0.2F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, false));

		shoulderSpike_r1 = new ModelRenderer(this);
		shoulderSpike_r1.setRotationPoint(-1.0F, -6.0F, 0.0F);
		RightArm.addChild(shoulderSpike_r1);
		setRotationAngle(shoulderSpike_r1, 0.0F, 0.0F, -0.1309F);
		shoulderSpike_r1.cubeList.add(new ModelBox(shoulderSpike_r1, 0, 52, -9.0F, -6.0F, 0.0F, 9, 12, 0, 0.0F, false));

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-2.3131F, -0.9631F, 0.0F);
		RightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.7854F, 0.0F, -0.1309F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 36, 44, -5.0F, -3.0F, -3.0F, 8, 6, 6, 0.3F, false));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 36, 32, -5.0F, -3.0F, -3.0F, 8, 6, 6, 0.1F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, false));

		spike_r1 = new ModelRenderer(this);
		spike_r1.setRotationPoint(0.0F, -4.0F, 0.0F);
		LeftArm.addChild(spike_r1);
		setRotationAngle(spike_r1, 0.0F, 0.0F, 0.1309F);
		spike_r1.cubeList.add(new ModelBox(spike_r1, 18, 53, -2.0F, -6.0F, 0.0F, 9, 6, 0, 0.0F, false));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(1.3131F, -0.9631F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, -0.7854F, 0.0F, 0.1309F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 0, 32, -3.0F, -3.0F, -3.0F, 8, 5, 5, 0.1F, false));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(1.3131F, -0.9631F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, -0.7854F, 0.0F, 0.1309F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 0, 42, -3.0F, -3.0F, -3.0F, 8, 5, 5, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}