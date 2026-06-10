// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBlackOrcBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder;
	private final ModelRenderer spike_r1;
	private final ModelRenderer shoulder_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer spike_r2;
	private final ModelRenderer shoulder_r2;

	public WFMModelBlackOrcBody() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 4.0F, 0.0F);
		body.texOffs(26, 15).addBox(-6.0F, -10.0F, -3.5F, 12.0F, 16.0F, 7.0F, 1.3F, false);
		body.texOffs(26, 41).addBox(-6.0F, -10.0F, -3.5F, 12.0F, 16.0F, 7.0F, 1.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(6.9564F, -2.999F, 0.0F);
		setRotationAngle(leftArm, 0.0F, -0.0436F, -0.0436F);
		leftArm.texOffs(0, 34).addBox(-0.1307F, 5.9952F, -2.9981F, 5.0F, 10.0F, 6.0F, 0.75F, true);
		leftArm.texOffs(0, 50).addBox(-1.1307F, -2.0048F, -3.4981F, 6.0F, 7.0F, 7.0F, 0.75F, true);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(2.7863F, -0.0874F, 0.0019F);
		leftArm.addChild(shoulder);
		setRotationAngle(shoulder, 0.0F, 0.0F, 0.5236F);
		shoulder.texOffs(32, 0).addBox(-3.5F, -3.0F, -4.5F, 7.0F, 6.0F, 9.0F, 0.75F, true);
		shoulder.texOffs(0, 0).addBox(-3.5F, -3.0F, -4.5F, 7.0F, 6.0F, 9.0F, 0.35F, true);

		spike_r1 = new ModelRenderer(this);
		spike_r1.setPos(-2.7707F, -6.3219F, -0.0114F);
		shoulder.addChild(spike_r1);
		setRotationAngle(spike_r1, -1.5708F, -0.7873F, 1.0889F);
		spike_r1.texOffs(0, 0).addBox(-3.7375F, 2.0597F, 2.1715F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spike_r1.texOffs(0, 0).addBox(-0.9116F, -0.766F, 1.9971F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spike_r1.texOffs(0, 0).addBox(1.9143F, -3.5916F, 1.8228F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		shoulder_r1 = new ModelRenderer(this);
		shoulder_r1.setPos(-2.0F, 0.0F, 0.0F);
		shoulder.addChild(shoulder_r1);
		setRotationAngle(shoulder_r1, 0.0F, 0.0F, -0.5236F);
		shoulder_r1.texOffs(0, 16).addBox(-1.5F, -5.0F, -5.0019F, 3.0F, 6.0F, 10.0F, 0.75F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-6.9564F, -2.999F, 0.0F);
		setRotationAngle(rightArm, 0.0F, 0.0436F, 0.0436F);
		rightArm.texOffs(0, 34).addBox(-4.8693F, 5.9952F, -2.9981F, 5.0F, 10.0F, 6.0F, 0.75F, false);
		rightArm.texOffs(0, 50).addBox(-4.8693F, -2.0048F, -3.4981F, 6.0F, 7.0F, 7.0F, 0.75F, false);

		shoulder2 = new ModelRenderer(this);
		shoulder2.setPos(1.927F, -7.1568F, -0.0565F);
		rightArm.addChild(shoulder2);
		setRotationAngle(shoulder2, 0.0F, 0.0F, -0.5672F);
		shoulder2.texOffs(32, 0).addBox(-11.8081F, 0.1339F, -4.4449F, 7.0F, 6.0F, 9.0F, 0.75F, false);
		shoulder2.texOffs(0, 0).addBox(-11.8081F, 0.1339F, -4.4449F, 7.0F, 6.0F, 9.0F, 0.35F, false);

		spike_r2 = new ModelRenderer(this);
		spike_r2.setPos(9.8739F, -4.2739F, 0.047F);
		shoulder2.addChild(spike_r2);
		setRotationAngle(spike_r2, -1.6006F, -0.7531F, 2.0688F);
		spike_r2.texOffs(0, 0).addBox(2.499F, 8.0828F, 9.5761F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spike_r2.texOffs(0, 0).addBox(5.3249F, 5.2572F, 9.4017F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spike_r2.texOffs(0, 0).addBox(8.1508F, 2.4315F, 9.2274F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		shoulder_r2 = new ModelRenderer(this);
		shoulder_r2.setPos(-4.3554F, 0.048F, 0.0565F);
		shoulder2.addChild(shoulder_r2);
		setRotationAngle(shoulder_r2, 0.0F, 0.0F, 0.5236F);
		shoulder_r2.texOffs(0, 16).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 6.0F, 10.0F, 0.75F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}