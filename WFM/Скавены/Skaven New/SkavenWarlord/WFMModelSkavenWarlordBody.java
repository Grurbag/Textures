// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenWarlordBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cape;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer spike_r1;
	private final ModelRenderer shoulder_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder;
	private final ModelRenderer spike_r2;
	private final ModelRenderer shoulder_r2;

	public WFMModelSkavenWarlordBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 7.0F, -2.0F);
		setRotationAngle(Body, 0.3927F, 0.0F, 0.0F);
		Body.texOffs(22, 13).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(22, 29).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, -5.0F, 3.0F);
		Body.addChild(cape);
		cape.texOffs(0, 12).addBox(-5.0F, -1.0F, 0.0F, 10.0F, 25.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, 4.0F, -4.0F);
		leftArm.texOffs(46, 15).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.49F, false);
		leftArm.texOffs(46, 38).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.69F, false);
		leftArm.texOffs(46, 25).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.1F, false);
		leftArm.texOffs(48, 48).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.29F, false);

		shoulder2 = new ModelRenderer(this);
		shoulder2.setPos(3.0F, 0.0F, 0.0F);
		leftArm.addChild(shoulder2);
		setRotationAngle(shoulder2, -2.3562F, 0.0F, 3.1416F);
		

		spike_r1 = new ModelRenderer(this);
		spike_r1.setPos(0.0F, -3.0F, 3.5F);
		shoulder2.addChild(spike_r1);
		setRotationAngle(spike_r1, 0.8165F, -0.2443F, -0.2519F);
		spike_r1.texOffs(-6, 0).addBox(-6.0F, -0.5F, -0.5F, 7.0F, 0.0F, 6.0F, 0.0F, false);

		shoulder_r1 = new ModelRenderer(this);
		shoulder_r1.setPos(-1.0F, 0.0F, 0.0F);
		shoulder2.addChild(shoulder_r1);
		setRotationAngle(shoulder_r1, 0.0311F, -0.2443F, -0.2519F);
		shoulder_r1.texOffs(40, 0).addBox(-3.0F, -2.5F, -3.5F, 6.0F, 6.0F, 6.0F, 0.49F, false);
		shoulder_r1.texOffs(16, 0).addBox(-3.0F, -2.5F, -3.5F, 6.0F, 6.0F, 6.0F, 0.69F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, 4.0F, -4.0F);
		rightArm.texOffs(46, 15).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.49F, true);
		rightArm.texOffs(46, 25).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.1F, true);
		rightArm.texOffs(46, 38).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.69F, true);
		rightArm.texOffs(48, 48).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.29F, true);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(-3.0F, 0.0F, 0.0F);
		rightArm.addChild(shoulder);
		setRotationAngle(shoulder, 0.7854F, 0.0F, 0.0F);
		

		spike_r2 = new ModelRenderer(this);
		spike_r2.setPos(14.0F, -3.0F, 3.5F);
		shoulder.addChild(spike_r2);
		setRotationAngle(spike_r2, 0.8165F, -0.2443F, -0.2519F);
		spike_r2.texOffs(-6, 0).addBox(-19.0F, -0.5F, 4.5F, 7.0F, 0.0F, 6.0F, 0.0F, false);

		shoulder_r2 = new ModelRenderer(this);
		shoulder_r2.setPos(-1.0F, 0.0F, 0.0F);
		shoulder.addChild(shoulder_r2);
		setRotationAngle(shoulder_r2, 0.0311F, -0.2443F, -0.2519F);
		shoulder_r2.texOffs(40, 0).addBox(-3.0F, -2.5F, -3.5F, 6.0F, 6.0F, 6.0F, 0.49F, false);
		shoulder_r2.texOffs(16, 0).addBox(-3.0F, -2.5F, -3.5F, 6.0F, 6.0F, 6.0F, 0.69F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}